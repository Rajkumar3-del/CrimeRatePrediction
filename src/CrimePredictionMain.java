import java.sql.*; import java.util.*;
public class CrimePredictionMain {
    public static void main(String[] args){
        List<Integer> yl=new ArrayList<>(); List<Integer> cl=new ArrayList<>();
        try(Connection con=DBConnection.getConnection()){
            PreparedStatement pst=con.prepareStatement("SELECT year, crimes FROM crime_data ORDER BY year");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){ yl.add(rs.getInt("year")); cl.add(rs.getInt("crimes")); }
        } catch(Exception e){ System.out.println(e); }
        int[] y=yl.stream().mapToInt(i->i).toArray();
        int[] c=cl.stream().mapToInt(i->i).toArray();
        double m=CrimePredictionModel.calculateSlope(y,c);
        double b=CrimePredictionModel.calculateIntercept(y,c,m);
        int fy=2025; double pred=m*fy+b;
        System.out.println("Predicted Crime in "+fy+" = "+(int)pred);
    }
}
