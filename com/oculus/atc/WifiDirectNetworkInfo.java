package com.oculus.atc;

import X.AnonymousClass001;
import X.KE9;
import X.KGu;
import X.KGv;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: WifiDirectNetworkInfo.class */
public final class WifiDirectNetworkInfo extends KJb implements MJ3 {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FIELD_NUMBER = 3;
    public static final WifiDirectNetworkInfo DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PORT_NUMBER_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public MRR addresses_ = KE9.A02;
    public Credentials credentials_;
    public int portNumber_;
    public int status_;

    /* loaded from: WifiDirectNetworkInfo$Credentials.class */
    public final class Credentials extends KJb implements MJ3 {
        public static final Credentials DEFAULT_INSTANCE;
        public static final int NETWORKNAME_FIELD_NUMBER = 1;
        public static volatile MGg PARSER;
        public static final int PASSPHRASE_FIELD_NUMBER = 2;
        public String networkName_ = "";
        public String passphrase_ = "";

        static {
            Credentials credentials = new Credentials();
            DEFAULT_INSTANCE = credentials;
            KJb.A0A(credentials, Credentials.class);
        }

        public static KGv newBuilder() {
            return DEFAULT_INSTANCE.A0D();
        }

        public static Credentials parseFrom(ByteBuffer byteBuffer) {
            return (Credentials) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                    return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002Ȉ", new Object[]{"networkName_", "passphrase_"});
                case 3:
                    return new Credentials();
                case 4:
                    return new KGv();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    obj3 = PARSER;
                    if (obj3 == null) {
                        synchronized (Credentials.class) {
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

    static {
        WifiDirectNetworkInfo wifiDirectNetworkInfo = new WifiDirectNetworkInfo();
        DEFAULT_INSTANCE = wifiDirectNetworkInfo;
        KJb.A0A(wifiDirectNetworkInfo, WifiDirectNetworkInfo.class);
    }

    public static KGu newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static WifiDirectNetworkInfo parseFrom(ByteBuffer byteBuffer) {
        return (WifiDirectNetworkInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004��\u0001��\u0001\f\u0002\u001b\u0003\t\u0004\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "credentials_", "portNumber_"});
            case 3:
                return new WifiDirectNetworkInfo();
            case 4:
                return new KGu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (WifiDirectNetworkInfo.class) {
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
