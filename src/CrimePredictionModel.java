public class CrimePredictionModel {
    public static double calculateSlope(int[] x, int[] y) {
        int n=x.length; double sx=0, sy=0, sxy=0, sxx=0;
        for(int i=0;i<n;i++){ sx+=x[i]; sy+=y[i]; sxy+=x[i]*y[i]; sxx+=x[i]*x[i]; }
        return (n*sxy - sx*sy) / (n*sxx - sx*sx);
    }
    public static double calculateIntercept(int[] x, int[] y, double slope) {
        int n=x.length; double sx=0, sy=0;
        for(int i=0;i<n;i++){ sx+=x[i]; sy+=y[i]; }
        return (sy - slope*sx)/n;
    }
}
