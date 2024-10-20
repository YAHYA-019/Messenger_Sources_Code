package com.meta.wearable.comms.calling.hera.engine.consensus;

import X.AnonymousClass001;
import X.KG5;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Packet.class */
public final class Packet extends KJb implements MJ3 {
    public static final int COMMAND_FIELD_NUMBER = 2;
    public static final int DATA_FIELD_NUMBER = 10;
    public static final int DATA_FORMAT_INTERNAL_USE_ONLY_FIELD_NUMBER = 6;
    public static final Packet DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int RESET_FIELD_NUMBER = 4;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 3;
    public static final int START_TIMESTAMP_MS_FIELD_NUMBER = 7;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public int command_;
    public int dataFormatInternalUseOnly_;
    public Lj5 data_ = Lj5.A00;
    public boolean reset_;
    public int sequenceNumber_;
    public long startTimestampMs_;
    public long timestampMs_;
    public int version_;

    static {
        Packet packet = new Packet();
        DEFAULT_INSTANCE = packet;
        KJb.A0A(packet, Packet.class);
    }

    public static KG5 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Packet parseFrom(ByteBuffer byteBuffer) {
        return (Packet) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\b��\u0001\u0001\n\b������\u0001\u000b\u0002\f\u0003\u000b\u0004\u0007\u0005စ��\u0006\f\u0007စ\u0001\n\n", new Object[]{"bitField0_", "version_", "command_", "sequenceNumber_", "reset_", "timestampMs_", "dataFormatInternalUseOnly_", "startTimestampMs_", "data_"});
            case 3:
                return new Packet();
            case 4:
                return new KG5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Packet.class) {
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
