package com.oculus.atc;

import X.AnonymousClass001;
import X.KGf;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkHealthUpdate.class */
public final class LinkHealthUpdate extends KJb implements MJ3 {
    public static final LinkHealthUpdate DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int RSSI_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 1;
    public int event_;
    public int rssi_;
    public Lj5 uuid_ = Lj5.A00;

    static {
        LinkHealthUpdate linkHealthUpdate = new LinkHealthUpdate();
        DEFAULT_INSTANCE = linkHealthUpdate;
        KJb.A0A(linkHealthUpdate, LinkHealthUpdate.class);
    }

    public static KGf newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkHealthUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LinkHealthUpdate) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\n\u0002\u0004\u0003\f", new Object[]{"uuid_", "rssi_", "event_"});
            case 3:
                return new LinkHealthUpdate();
            case 4:
                return new KGf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkHealthUpdate.class) {
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
