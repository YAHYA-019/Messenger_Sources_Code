package com.facebook.privacy.e2ee;

import java.util.List;

/* loaded from: PeerPublicKeyStore.class */
public interface PeerPublicKeyStore {
    boolean clearPublicKeys();

    boolean clearVestaBackupPublicKey();

    int getLatestStorageUpdateTimestampSec();

    PeerPublicKey getPublicKeyForDevice(String str);

    List getPublicKeys();

    PeerPublicKey getVestaBackupPublicKey();

    boolean removePublicKey(String str);

    boolean storePublicKeys(List list);

    boolean storeVestaBackupPublicKey(PeerPublicKey peerPublicKey);
}
