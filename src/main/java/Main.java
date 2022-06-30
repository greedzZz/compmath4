public class Main {

    public static void main(String[] arg) {
        try {
            IOManager ioManager = new IOManager();
            Function function = Data.FUNCTIONS[ioManager.readFunctionNumber() - 1];
            boolean noise = ioManager.readNoise() == 1;
            int n = ioManager.readNumberOfValues();
            double[] x = ioManager.readValues(n);
            double[] y = new double[n];
            if (!noise) for (int i = 0; i < n; i++) y[i] = function.getValueOfFunction(x[i]);
            else for (int i = 0; i < n; i++) y[i] = function.getValueOfFunction(x[i]) + Math.random() / 10;
            SplineMethod splineMethod = new SplineMethod(x, y, n);
            Splines splines = splineMethod.getSpline();
            GraphDisplay graphDisplay = new GraphDisplay(splines, function.getStringFunction());
            graphDisplay.draw(function);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

