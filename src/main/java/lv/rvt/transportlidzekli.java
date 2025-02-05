package lv.rvt;

public class transportlidzekli {
    
}

abstract class Transportlidzeklis {
    String nosaukums;
    int atrums;

    Transportlidzeklis(String nosaukums, int atrums) {
        this.nosaukums = nosaukums;
        this.atrums = atrums;
    }

    abstract String kustibasVeids();
}

class Automobilis extends Transportlidzeklis {
    Automobilis(String nosaukums, int atrums) {
        super(nosaukums, atrums);
    }

    @Override
    String kustibasVeids() {
        return nosaukums + " brauc pa ceļu ar ātrumu " + atrums + " km/h.";
    }
}

class Laiva extends Transportlidzeklis {
    Laiva(String nosaukums, int atrums) {
        super(nosaukums, atrums);
    }

    @Override
    String kustibasVeids() {
        return nosaukums + " peld pa ūdeni ar ātrumu " + atrums + " mezgli.";
    }
}

