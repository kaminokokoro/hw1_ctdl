public class Sphere {

    public static class sphere{
        private double x;
        private double y;
        private double z;
        private double radius;

        public sphere(double x, double y, double z, double radius){
            this.x = x;
            this.y = y;
            this.z = z;
            this.radius = radius;
        }

        public double getVolume(){
            return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
        }

        public double getSurfaceArea(){
            return 4 * Math.PI * Math.pow(this.radius, 2);
        }

        public boolean intersect(sphere s){
            double distance = Math.sqrt(Math.pow(this.x - s.x, 2) + Math.pow(this.y - s.y, 2) + Math.pow(this.z - s.z, 2));
            return distance < this.radius + s.radius;
        }
        public boolean nested(sphere s){
            double distance = Math.sqrt(Math.pow(this.x - s.x, 2) + Math.pow(this.y - s.y, 2) + Math.pow(this.z - s.z, 2));
            return distance < Math.abs(this.radius - s.radius);
        }
    }

    public static void main(String[] args) {
        sphere s1 = new sphere(0, 0, 0, 1);
        sphere s2 = new sphere(1, 1, 1, 1);
        System.out.println("s1 volume: " + s1.getVolume());
        System.out.println("s1 surface area: " + s1.getSurfaceArea());
        System.out.println("s2 volume: " + s2.getVolume());
        System.out.println("s2 surface area: " + s2.getSurfaceArea());
        System.out.println("s1 intersect s2: " + s1.intersect(s2));
        System.out.println("s1 nested s2: " + s1.nested(s2));
    }
}
