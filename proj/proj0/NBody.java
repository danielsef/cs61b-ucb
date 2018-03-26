import java.util.List;
import java.util.ArrayList;

public class NBody {
    
    /** Query a double corresponding to the radius of the universe in that file.
        Args:
            dir(String): Directory path to txt file.
        Returns:
            R(double): Radius of the universe in that file
    */
    public static double readRadius(String dir) {
        In in = new In(dir);

        int N = in.readInt();
        double R = in.readDouble();
        return R;
    }


    /** Query an array of Planets corresponding to the planets in the file.
        Args:
            dir(String): Directory path to txt file.
        Returns:
            blablabal
    */
    public static Planet[] readPlanets(String dir) {
        In in = new In(dir);
        int N = in.readInt();
        double R = in.readDouble();
        int row = 0;

        List<Planet> planets = new ArrayList<Planet>();

        while(!in.isEmpty()) {
            String xxPs = in.readString();
            try{
                double xxP = Double.parseDouble(xxPs);
            } catch (java.lang.NumberFormatException e) {
            	break;
            }
            String yyPs = in.readString();
            String xxVs = in.readString();
            String yyVs = in.readString();
            String masss = in.readString();
            String imgfile = in.readString();
            // String planetName = imgfile.split("\\.")[0];
            double xxP = Double.parseDouble(xxPs);
            double yyP = Double.parseDouble(yyPs);
            double xxV = Double.parseDouble(xxVs);
            double yyV = Double.parseDouble(yyPs);
            double mass = Double.parseDouble(masss);

            Planet p = new Planet(xxP, yyP, xxV, yyV, mass, imgfile);
            planets.add(p);
        }
        // Planet[] planets = {planetName}
        Planet planet[] = new Planet[planets.size()];
        planets.toArray(planet);

        return planet;

    }




    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = readRadius(filename);
        Planet planets = readPlanets(filename);
    }







}