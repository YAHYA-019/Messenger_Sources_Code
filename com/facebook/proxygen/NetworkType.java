package com.facebook.proxygen;

/* loaded from: NetworkType.class */
public class NetworkType {

    /* loaded from: NetworkType$CellularType.class */
    public enum CellularType {
        NOT_CELLULAR(0),
        G2(1),
        G3(2),
        G4(3),
        UNKNOWN(4);

        public int value;

        CellularType(int i) {
            this.value = i;
        }
    }

    /* loaded from: NetworkType$ConnectivityType.class */
    public enum ConnectivityType {
        NOCONN(0),
        WIFI(1),
        CELLULAR(2),
        OTHER(3);

        public int value;

        ConnectivityType(int i) {
            this.value = i;
        }
    }
}
