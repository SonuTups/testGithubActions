    package test.test.model;

    import jakarta.persistence.*;

    @Entity
    @Table
    public class Bikes {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long bikeId;
        private String name;
        private String cc;

        public Bikes() {
        }

        private long cost;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCc(String cc) {
            this.cc = cc;
        }

        public void setCost(long cost) {
            this.cost = cost;
        }

        public String getCc() {
            return cc;
        }

        public long getCost() {
            return cost;
        }

        public Bikes(String name, String cc, long cost) {
            this.name = name;
            this.cc = cc;
            this.cost = cost;
        }
    }
