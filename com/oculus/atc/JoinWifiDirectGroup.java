package com.oculus.atc;

import X.AnonymousClass001;
import X.KE9;
import X.KGY;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: JoinWifiDirectGroup.class */
public final class JoinWifiDirectGroup extends KJb implements MJ3 {
    public static final int BANDWIDTH_FIELD_NUMBER = 8;
    public static final int CLIENT_ADDRESSES_FIELD_NUMBER = 4;
    public static final JoinWifiDirectGroup DEFAULT_INSTANCE;
    public static final int FREQUENCY_FIELD_NUMBER = 7;
    public static final int OWNER_ADDRESS_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 6;
    public int bandwidth_;
    public int frequency_;
    public NetworkAddress ownerAddress_;
    public int timeout_;
    public String ssid_ = "";
    public String passphrase_ = "";
    public MRR clientAddresses_ = KE9.A02;
    public Lj5 uuid_ = Lj5.A00;

    static {
        JoinWifiDirectGroup joinWifiDirectGroup = new JoinWifiDirectGroup();
        DEFAULT_INSTANCE = joinWifiDirectGroup;
        KJb.A0A(joinWifiDirectGroup, JoinWifiDirectGroup.class);
    }

    public static KGY newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static JoinWifiDirectGroup parseFrom(ByteBuffer byteBuffer) {
        return (JoinWifiDirectGroup) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
    }

    public final Object dynamicMethod(KMJ kmj, Object obj, Object obj2) {
        Object obj3;
        MGg mGg;
        switch (kmj.ordinal()) {
            case 0:
                obj3 = (byte) 1;
                break;
            case 1:
                return null;
            case 2:
                return KJb.A05(DEFAULT_INSTANCE, "��\b����\u0001\b\b��\u0001��\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u001b\u0005\t\u0006\n\u0007\u0004\b\f", new Object[]{"ssid_", "passphrase_", "timeout_", "clientAddresses_", NetworkAddress.class, "ownerAddress_", "uuid_", "frequency_", "bandwidth_"});
            case 3:
                return new JoinWifiDirectGroup();
            case 4:
                return new KGY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (JoinWifiDirectGroup.class) {
                        mGg = PARSER;
                        if (mGg == null) {
                            L9l l9l = Lgf.A01;
                            mGg = KJb.A00(DEFAULT_INSTANCE);
                            PARSER = mGg;
                        }
                    }
                    return mGg;
                }
                break;
            default:
                throw AnonymousClass001.A0p();
        }
        return obj3;
    }
}
