package design.decorator;

    public class Zucker extends Decorator{

        public Zucker(Kaffee kaffee) {
            super(kaffee);
        }

        @Override
        public String desc() {
            return kaffee.desc() + " mit Zucker";
        }

        @Override
        public double cost() {
            return kaffee.cost() + 0.50;
        }
    }