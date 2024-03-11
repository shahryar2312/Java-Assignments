public class Distance {
    public static void main(String[] args)
    {
        double ax = -5.5;
        double ay = 2;
        double bx = -3;
        double by = -2.2;
        double cx = 1;
        double cy = 2;
        double dx = 7;
        double dy = 4.6;
        double ab = Math.sqrt(((bx-ax)*(bx-ax))+((by-ay)*(by-ay))); // put the square root as we know formula distance between two points
        double bc = Math.sqrt(((cx-bx)*(cx-bx))+((cy-by)*(cy-by))); // put the square root as we know formula distance between two points
        double cd = Math.sqrt(((dx-cx)*(dx-cx))+((dy-cy)*(dy-cy))); // put the square root as we know formula distance between two points
        System.out.println("Distance from -5.5,2.0 to -3.0,-2.2 is " + Math.round(ab*100.00)/100.00); // put the round off up to 2 decimal
        System.out.println("Distance from -3.0,-2.2 to 1.0,2.0 is " + Math.round(bc*100.00)/100.00); // put the round off up to 2 decimal
        System.out.println("Distance from 1.0,2.0 to 7.0,4.6 is " + Math.round(cd*100.00)/100.00);  // put the round off up to 2 decimal
    }
    }
