package X;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4Ka, reason: invalid class name */
/* loaded from: 4Ka.class */
public abstract class C4Ka {
    public static final int A00(C4Kb c4Kb) {
        11T.A0F(c4Kb, 0);
        switch (c4Kb) {
            case ENQUEUED:
                return 0;
            case RUNNING:
                return 1;
            case SUCCEEDED:
                return 2;
            case FAILED:
                return 3;
            case BLOCKED:
                return 4;
            case CANCELLED:
                return 5;
            default:
                throw new RuntimeException();
        }
    }

    public static final int A01(Integer num) {
        11T.A0F(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            return 3;
        }
        if (intValue == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT < 30 || num != 0S2.A0j) {
            throw AnonymousClass001.A0L(0Pz.A0j("Could not convert ", C4S5.A00(num), " to int"));
        }
        return 5;
    }

    public static final C4Kb A02(int i) {
        if (i == 0) {
            return C4Kb.ENQUEUED;
        }
        if (i == 1) {
            return C4Kb.RUNNING;
        }
        if (i == 2) {
            return C4Kb.SUCCEEDED;
        }
        if (i == 3) {
            return C4Kb.FAILED;
        }
        if (i == 4) {
            return C4Kb.BLOCKED;
        }
        if (i == 5) {
            return C4Kb.CANCELLED;
        }
        throw 0Pz.A06("Could not convert ", " to State", i);
    }

    public static final Integer A03(int i) {
        if (i == 0) {
            return 0S2.A00;
        }
        if (i == 1) {
            return 0S2.A01;
        }
        throw 0Pz.A06("Could not convert ", " to BackoffPolicy", i);
    }

    public static final Integer A04(int i) {
        if (i == 0) {
            return 0S2.A00;
        }
        if (i == 1) {
            return 0S2.A01;
        }
        if (i == 2) {
            return 0S2.A0C;
        }
        if (i == 3) {
            return 0S2.A0N;
        }
        if (i == 4) {
            return 0S2.A0Y;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw 0Pz.A06("Could not convert ", " to NetworkType", i);
        }
        return 0S2.A0j;
    }

    public static final Integer A05(int i) {
        if (i == 0) {
            return 0S2.A00;
        }
        if (i == 1) {
            return 0S2.A01;
        }
        throw 0Pz.A06("Could not convert ", " to OutOfQuotaPolicy", i);
    }

    public static final LinkedHashSet A06(byte[] bArr) {
        ObjectInputStream objectInputStream;
        11T.A0F(bArr, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    11T.A0A(parse);
                    linkedHashSet.add(new 4UJ(readBoolean, parse));
                }
                objectInputStream.close();
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] A07(Set set) {
        11T.A0F(set, 0);
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    4UJ r0 = (4UJ) it.next();
                    objectOutputStream.writeUTF(r0.A00.toString());
                    objectOutputStream.writeBoolean(r0.A01);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                11T.A0A(byteArray);
                return byteArray;
            } finally {
            }
        } finally {
        }
    }
}
