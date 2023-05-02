abstract class Metal{
    private int endurance;
    
    Metal(int endurance){
        this.endurance = endurance;
    }
    
    int getEndurance(){
        return this.endurance;
    }
}

class Steel extends Metal{
    Steel(){
        super(50);
    }
}

class Copper extends Metal{
    Copper(){
        super(-30);
    }
}

class Iron extends Metal{
    Iron() {
        super(20);
    }
}

class Plastic{ }

class Sword <T extends Metal>{
    T metal;

    Sword(T metal){
        this.metal = metal;
    }

    boolean swordTest() {
        if (this.metal.getEndurance() > 49) return true;
        return false;
    }
}
