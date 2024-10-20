package com.facebook.privacy.e2ee.genericimpl.store;

import X.0QD;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Fi;
import X.3sP;
import X.3sR;
import X.5BC;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.AnonymousClass259;
import X.C0dp;
import X.InterfaceC00051a0;
import X.Qps;
import com.facebook.privacy.e2ee.PeerPublicKey;
import com.facebook.privacy.e2ee.PeerPublicKeyStore;
import com.facebook.privacy.e2ee.PublicKeyType;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PublicKeyStoreImpl.class */
public final class PublicKeyStoreImpl implements PeerPublicKeyStore {
    public static final Companion Companion = new Object();
    public final C0dp clock;
    public final AnonymousClass259 jsonFactory;
    public final AnonymousClass244 objectMapper;
    public 1Fi sharedPreferences;

    /* loaded from: PublicKeyStoreImpl$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List fromSerializableKeyList(List list) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PeerPublicKeyWireModel peerPublicKeyWireModel = (PeerPublicKeyWireModel) it.next();
                A0s.add(new PeerPublicKey(peerPublicKeyWireModel.deviceUuid, peerPublicKeyWireModel.getPublicKey(), Qps.valueOf(peerPublicKeyWireModel.getVersion()), PublicKeyType.valueOf(peerPublicKeyWireModel.getKeyType()), peerPublicKeyWireModel.creationTimeOnDevice));
            }
            return A0s;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.privacy.e2ee.genericimpl.store.PeerPublicKeyWireModel, java.lang.Object] */
        public final List toSerializableKeyList(List list) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PeerPublicKey peerPublicKey = (PeerPublicKey) it.next();
                ?? obj = new Object();
                obj.deviceUuid = peerPublicKey.deviceUuid;
                obj.setPublicKey(peerPublicKey.getPublicKey());
                obj.setVersion(peerPublicKey.version.name());
                obj.setKeyType(peerPublicKey.keyType.name());
                obj.creationTimeOnDevice = peerPublicKey.creationTimeOnDevice;
                A0s.add(obj);
            }
            return A0s;
        }
    }

    public PublicKeyStoreImpl(1Fi r302, C0dp c0dp) {
        1BL.A1F(r302, c0dp);
        this.clock = c0dp;
        this.sharedPreferences = r302;
        this.objectMapper = new AnonymousClass244();
        this.jsonFactory = new AnonymousClass259();
    }

    private final boolean clearPublicKeys(boolean z) {
        InterfaceC00051a0 AP5 = this.sharedPreferences.AP5();
        AP5.Cdi(getKeyToUse(z));
        AP5.CaD(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, (int) TimeUnit.MILLISECONDS.toSeconds(this.clock.now()));
        return AP5.commit();
    }

    public static /* synthetic */ boolean clearPublicKeys$default(PublicKeyStoreImpl publicKeyStoreImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return publicKeyStoreImpl.clearPublicKeys(z);
    }

    private final String getKeyToUse(boolean z) {
        if (z) {
            return PublicKeyStoreImplKt.VESTA_BACKUP_PUBLIC_KEY_VALUE;
        }
        if (z) {
            throw 1BK.A1F();
        }
        return PublicKeyStoreImplKt.DEVICE_TO_DEVICE_KEYS_VALUE;
    }

    private final List readFromStore(1Fi r302, boolean z) {
        String string = r302.getString(getKeyToUse(z), "");
        11T.A0D(string);
        if (AnonymousClass001.A1O(string.length())) {
            return AnonymousClass001.A0s();
        }
        try {
            Object A0Q = this.objectMapper.A0Q(new 5BC() { // from class: com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImpl$readFromStore$typeRef$1
            }, string);
            11T.A0D(A0Q);
            return (List) A0Q;
        } catch (IOException e) {
            0fH.A0r(PublicKeyStoreImplKt.TAG, "readFromStorage: failure", e);
            return AnonymousClass001.A0s();
        }
    }

    public static /* synthetic */ List readFromStore$default(PublicKeyStoreImpl publicKeyStoreImpl, 1Fi r302, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return publicKeyStoreImpl.readFromStore(r302, z);
    }

    private final boolean writeToStore(1Fi r302, List list, boolean z) {
        StringWriter stringWriter = new StringWriter();
        try {
            3sP A07 = this.jsonFactory.A07(stringWriter);
            try {
                ((3sR) A07).A01 = this.objectMapper;
                A07.A0P(list);
                A07.close();
                String A02 = 11T.A02(stringWriter);
                InterfaceC00051a0 AP5 = r302.AP5();
                AP5.CaK(getKeyToUse(z), A02);
                AP5.CaD(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, (int) TimeUnit.MILLISECONDS.toSeconds(this.clock.now()));
                return AP5.commit();
            } finally {
            }
        } catch (IOException e) {
            0fH.A0r(PublicKeyStoreImplKt.TAG, "writeToStorage: failure", e);
            return false;
        }
    }

    public static /* synthetic */ boolean writeToStore$default(PublicKeyStoreImpl publicKeyStoreImpl, 1Fi r302, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return publicKeyStoreImpl.writeToStore(r302, list, z);
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public boolean clearPublicKeys() {
        return clearPublicKeys(false);
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public boolean clearVestaBackupPublicKey() {
        return clearPublicKeys(true);
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public int getLatestStorageUpdateTimestampSec() {
        return this.sharedPreferences.getInt(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, 0);
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public PeerPublicKey getPublicKeyForDevice(String str) {
        11T.A0F(str, 0);
        PeerPublicKey peerPublicKey = null;
        Iterator it = readFromStore(this.sharedPreferences, false).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PeerPublicKeyWireModel peerPublicKeyWireModel = (PeerPublicKeyWireModel) it.next();
            String str2 = peerPublicKeyWireModel.deviceUuid;
            if (11T.A0O(str2, str)) {
                peerPublicKey = new PeerPublicKey(str2, peerPublicKeyWireModel.getPublicKey(), Qps.valueOf(peerPublicKeyWireModel.getVersion()), PublicKeyType.valueOf(peerPublicKeyWireModel.getKeyType()), peerPublicKeyWireModel.creationTimeOnDevice);
                break;
            }
        }
        return peerPublicKey;
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public List getPublicKeys() {
        return Companion.fromSerializableKeyList(readFromStore(this.sharedPreferences, false));
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public PeerPublicKey getVestaBackupPublicKey() {
        return (PeerPublicKey) 0QD.A0I(Companion.fromSerializableKeyList(readFromStore(this.sharedPreferences, true)));
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public boolean removePublicKey(String str) {
        boolean writeToStore;
        synchronized (this) {
            11T.A0F(str, 0);
            List<PeerPublicKeyWireModel> readFromStore = readFromStore(this.sharedPreferences, false);
            ArrayList A0s = AnonymousClass001.A0s();
            for (PeerPublicKeyWireModel peerPublicKeyWireModel : readFromStore) {
                if (!11T.A0O(peerPublicKeyWireModel.deviceUuid, str)) {
                    A0s.add(peerPublicKeyWireModel);
                }
            }
            writeToStore = writeToStore(this.sharedPreferences, A0s, false);
        }
        return writeToStore;
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public boolean storePublicKeys(List list) {
        11T.A0F(list, 0);
        return writeToStore(this.sharedPreferences, Companion.toSerializableKeyList(list), false);
    }

    @Override // com.facebook.privacy.e2ee.PeerPublicKeyStore
    public boolean storeVestaBackupPublicKey(PeerPublicKey peerPublicKey) {
        11T.A0F(peerPublicKey, 0);
        return writeToStore(this.sharedPreferences, Companion.toSerializableKeyList(11T.A03(peerPublicKey)), true);
    }
}
