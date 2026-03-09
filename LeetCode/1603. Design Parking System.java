class ParkingSystem {
    int[] emptySlots;

    public ParkingSystem(int big, int medium, int small) {
        this.emptySlots = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(this.emptySlots[carType - 1] > 0){
            this.emptySlots[carType - 1]--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
