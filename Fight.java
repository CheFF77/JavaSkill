public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();
        fight(ork,elf);
    }
    private static void fight(Ork ork, Elf elf) {
        while (true) {
            if (!ork.status && elf.status) {
                System.out.println("Ork is dead. Elf win!");
                break;
            } else if (ork.status && !elf.status) {
                System.out.println("Elf is dead. Ork win!");
                break;
            } else if (!ork.status && !elf.status) {
                System.out.println("All is dead...");
                break;
            }
            if (elf.health < 0) {
                elf.status = false;
            } else {
                elf.health -= ork.kickPower;
            }
            if (ork.health < 0) {
                ork.status = false;
            } else {
                ork.health -= elf.kickpower;
            }
        }
    }
}
