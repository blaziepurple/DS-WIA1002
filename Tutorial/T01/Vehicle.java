abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed, double currentSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        while (currentSpeed != maxSpeed){
            accelerate();
        }
    }
}

/*
An instance of Vehicle can't be created because it does not have any non-abstract
subclasses.
 */