package Abstract_5_3;

public class RenaultEnigine extends Engine{
    double extraTurboEnergy;

    public RenaultEnigine() {
    }

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency(){
        return 0.27;
    }

    @Override
    public double throttleEnergy(){
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }

    @Override
    public double breakEnergy(){
        return engineWeight*2.1;
    }
}