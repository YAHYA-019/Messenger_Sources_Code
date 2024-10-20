package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4J6, reason: invalid class name */
/* loaded from: 4J6.class */
public final class C4J6 {
    public static final String[] A0E = {"UPDATE", "DELETE", "INSERT"};
    public final C4J8 A01;
    public final C4Il A02;
    public final Runnable A04;
    public final String[] A07;
    public final java.util.Map A0A;
    public final java.util.Map A0B;
    public volatile 4KS A0C;
    public volatile boolean A0D;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final C4J7 A08 = new C4J7();
    public final 0QJ A00 = new 0QJ();
    public final Object A09 = new Object();
    public final Object A03 = new Object();
    public final java.util.Map A05 = new LinkedHashMap();

    public C4J6(C4Il c4Il, java.util.Map map, java.util.Map map2, String... strArr) {
        Locale locale;
        this.A02 = c4Il;
        this.A0A = map;
        this.A0B = map2;
        int i = 0;
        this.A01 = new C4J8(c4Il);
        String[] strArr2 = new String[7];
        do {
            String str = strArr[i];
            locale = Locale.US;
            11T.A0B(locale);
            String lowerCase = str.toLowerCase(locale);
            11T.A0A(lowerCase);
            this.A05.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.A0A.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                11T.A0A(lowerCase);
            }
            strArr2[i] = lowerCase;
            i++;
        } while (i < 7);
        this.A07 = strArr2;
        Iterator it = this.A0A.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            String lowerCase2 = ((String) A0z.getValue()).toLowerCase(locale);
            11T.A0A(lowerCase2);
            if (this.A05.containsKey(lowerCase2)) {
                String lowerCase3 = AnonymousClass001.A0j(A0z).toLowerCase(locale);
                11T.A0A(lowerCase3);
                java.util.Map map3 = this.A05;
                11T.A0F(map3, 0);
                map3.put(lowerCase3, 02K.A03(lowerCase2, map3));
            }
        }
        this.A04 = new Runnable() { // from class: X.4J9
            public static final String __redex_internal_original_name = "InvalidationTracker$refreshRunnable$1";

            /* JADX WARN: Removed duplicated region for block: B:124:0x02c3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x01ea A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 739
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4J9.run():void");
            }
        };
    }

    private final void A00() {
        C4Il c4Il = this.A02;
        4KH r0 = c4Il.A0B;
        if (r0 == null || !r0.A00.isOpen()) {
            return;
        }
        A04(c4Il.A03().BL3());
    }

    public static final String[] A01(C4J6 c4j6, String[] strArr) {
        0Ju r0 = new 0Ju();
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return (String[]) 02I.A03(r0).toArray(new String[0]);
            }
            String str = strArr[i2];
            java.util.Map map = c4j6.A0B;
            Locale locale = Locale.US;
            11T.A0B(locale);
            String lowerCase = str.toLowerCase(locale);
            11T.A0A(lowerCase);
            if (map.containsKey(lowerCase)) {
                Object obj = map.get(lowerCase);
                11T.A0D(obj);
                r0.addAll((Collection) obj);
            } else {
                r0.add(str);
            }
            i = i2 + 1;
        }
    }

    public void A02(KoV koV) {
        4TV r0;
        boolean z;
        String[] A01 = A01(this, koV.A00);
        int length = A01.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                int[] A0n = 0QD.A0n(A0t);
                4TV r02 = new 4TV(koV, A0n, A01);
                C4J7 c4j7 = this.A00;
                synchronized (c4j7) {
                    try {
                        r0 = (4TV) c4j7.A02(koV, r02);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (r0 == null) {
                    c4j7 = this.A08;
                    int[] copyOf = Arrays.copyOf(A0n, A0n.length);
                    11T.A0F(copyOf, 0);
                    synchronized (c4j7) {
                        z = false;
                        for (int i3 : copyOf) {
                            long[] jArr = c4j7.A01;
                            long j = jArr[i3];
                            jArr[i3] = 1 + j;
                            if (j == 0) {
                                c4j7.A00 = true;
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        A00();
                        return;
                    }
                    return;
                }
                return;
            }
            String str = A01[i2];
            java.util.Map map = this.A05;
            Locale locale = Locale.US;
            11T.A0B(locale);
            String lowerCase = str.toLowerCase(locale);
            11T.A0A(lowerCase);
            Object obj = map.get(lowerCase);
            if (obj == null) {
                throw 0Pz.A05("There is no table with name ", str);
            }
            A0t.add(obj);
            i = i2 + 1;
        }
    }

    public void A03(KoV koV) {
        4TV r0;
        boolean z;
        0QJ r02 = this.A00;
        synchronized (r02) {
            r0 = (4TV) r02.A01(koV);
        }
        if (r0 != null) {
            C4J7 c4j7 = this.A08;
            int[] iArr = r0.A02;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            11T.A0F(copyOf, 0);
            synchronized (c4j7) {
                z = false;
                for (int i : copyOf) {
                    long[] jArr = c4j7.A01;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        c4j7.A00 = true;
                        z = true;
                    }
                }
            }
            if (z) {
                A00();
            }
        }
    }

    public final void A04(4KI r302) {
        11T.A0F(r302, 0);
        SQLiteDatabase sQLiteDatabase = ((4KH) r302).A00;
        if (sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.A02.A08.readLock();
            11T.A0A(readLock);
            readLock.lock();
            try {
                synchronized (this.A09) {
                    int[] A00 = this.A08.A00();
                    if (A00 != null) {
                        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                            C01m.A02(sQLiteDatabase, 532084787);
                        } else {
                            C01m.A01(sQLiteDatabase, 688438778);
                        }
                        try {
                            int length = A00.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = A00[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    r302.ARC(0Pz.A0d("INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)", i2));
                                    String str = this.A07[i2];
                                    String[] strArr = A0E;
                                    int i5 = 0;
                                    do {
                                        String str2 = strArr[i5];
                                        StringBuilder A0k = AnonymousClass001.A0k();
                                        A0k.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                        11T.A0F(str, 0);
                                        11T.A0F(str2, 1);
                                        StringBuilder A0k2 = AnonymousClass001.A0k();
                                        A0k2.append("`room_table_modification_trigger_");
                                        A0k2.append(str);
                                        A0k2.append('_');
                                        A0k2.append(str2);
                                        A0k2.append('`');
                                        1BK.A1R(A0k, A0k2);
                                        A0k.append(" AFTER ");
                                        A0k.append(str2);
                                        A0k.append(" ON `");
                                        A0k.append(str);
                                        A0k.append("` BEGIN UPDATE ");
                                        A0k.append("room_table_modification_log");
                                        A0k.append(" SET ");
                                        A0k.append("invalidated");
                                        A0k.append(" = 1");
                                        A0k.append(" WHERE ");
                                        A0k.append("table_id");
                                        A0k.append(" = ");
                                        A0k.append(i2);
                                        A0k.append(AnonymousClass000.A00(37));
                                        A0k.append("invalidated");
                                        A0k.append(" = 0");
                                        String A0d = AnonymousClass001.A0d("; END", A0k);
                                        11T.A0A(A0d);
                                        r302.ARC(A0d);
                                        i5++;
                                    } while (i5 < 3);
                                } else if (i3 == 2) {
                                    String str3 = this.A07[i2];
                                    String[] strArr2 = A0E;
                                    int i6 = 0;
                                    do {
                                        String str4 = strArr2[i6];
                                        11T.A0F(str3, 0);
                                        11T.A0F(str4, 1);
                                        StringBuilder A0k3 = AnonymousClass001.A0k();
                                        A0k3.append("`room_table_modification_trigger_");
                                        A0k3.append(str3);
                                        A0k3.append('_');
                                        A0k3.append(str4);
                                        String A0W = 0Pz.A0W("DROP TRIGGER IF EXISTS ", AnonymousClass001.A0g(A0k3, '`'));
                                        11T.A0A(A0W);
                                        r302.ARC(A0W);
                                        i6++;
                                    } while (i6 < 3);
                                }
                                i++;
                                i2 = i4;
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            r302.AQJ();
                        } catch (Throwable th) {
                            r302.AQJ();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e) {
            android.util.Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }
    }
}
