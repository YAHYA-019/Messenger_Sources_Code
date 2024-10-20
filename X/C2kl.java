package X;

import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2kl, reason: invalid class name */
/* loaded from: 2kl.class */
public final class C2kl extends 2Yf {
    public FbUserSession A00;
    public C2i8 A01;
    public 2YH A02;
    public 2kT A03;
    public C2i7 A04;
    public MigColorScheme A05;
    public ImmutableList A06;

    public C2kl() {
        super("FriendsInboxUnitSection");
    }

    public static int A0I(ImmutableList immutableList, ImmutableList immutableList2, int i) {
        int max = Math.max(immutableList.size(), immutableList2.size());
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i && i2 < max) {
            2kQ r309 = null;
            2kQ r310 = immutableList.size() > i2 ? (2kQ) immutableList.get(i2) : null;
            if (immutableList2.size() > i2) {
                r309 = (2kQ) immutableList2.get(i2);
            }
            boolean z = true;
            boolean z2 = false;
            if (r310 != null) {
                z2 = true;
            }
            if (r309 == null) {
                z = false;
            }
            if ((z ^ z2) || (r310 != null && r309 != null && !A0J(r310, r309).booleanValue())) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public static Boolean A0J(2kQ r301, 2kQ r302) {
        int i = r301.A00;
        boolean z = false;
        if (i != 0) {
            if (i != 3) {
                int i2 = r302.A00;
                if (i != 8) {
                    if (i == i2) {
                        z = true;
                    }
                } else if (i2 == 8) {
                    C2gy c2gy = r301.A03;
                    c2gy.getClass();
                    C2gy c2gy2 = r302.A03;
                    c2gy2.getClass();
                    z = c2gy.BVb(c2gy2);
                }
            } else if (r302.A00 == 3) {
                Object obj = null;
                obj.getClass();
                throw 0Q8.createAndThrow();
            }
        } else if (r302.A00 == 0) {
            3xR r0 = r301.A02;
            r0.getClass();
            3xR r02 = r302.A02;
            r02.getClass();
            z = r0.BVb(r02);
        }
        return Boolean.valueOf(z);
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((C2km) r303).A00 = ((C2km) r302).A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x046f A[Catch: all -> 0x0659, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0659, blocks: (B:31:0x021b, B:35:0x0229, B:37:0x0236, B:50:0x02cd, B:52:0x02dd, B:56:0x02ed, B:64:0x0306, B:66:0x0309, B:69:0x0313, B:71:0x0326, B:73:0x032f, B:75:0x0336, B:77:0x0339, B:82:0x0341, B:84:0x0344, B:156:0x046f, B:158:0x0478, B:159:0x0481, B:162:0x048d, B:165:0x0499, B:166:0x04a0, B:167:0x04a7, B:168:0x04ae, B:169:0x04b5, B:170:0x04be, B:171:0x04c5, B:172:0x04ce, B:177:0x04f7, B:178:0x04fe, B:180:0x050a, B:181:0x0511, B:183:0x051a, B:184:0x0521, B:188:0x0536, B:190:0x0549, B:192:0x0550, B:199:0x0580, B:201:0x058a, B:203:0x059a, B:205:0x05a4, B:207:0x05b4, B:209:0x05c2, B:211:0x05d2, B:213:0x05dc, B:215:0x05ec, B:217:0x05f6, B:219:0x0606, B:221:0x060d, B:223:0x061b, B:225:0x0625, B:227:0x0635, B:229:0x063c, B:233:0x0641, B:235:0x064a, B:236:0x0651, B:60:0x02f3, B:62:0x02ff), top: B:30:0x021b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Z(X.2Yy r302, X.C1qb r303, int r304, int r305, int r306, long r307, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kl.A0Z(X.2Yy, X.1qb, int, int, int, long, boolean, boolean):void");
    }

    public void A0a(C1qb c1qb) {
        ((C2km) ((2Yf) this).A03).A00 = ImmutableList.of();
    }

    public void A0b(C1qb c1qb, int i, int i2, int i3, int i4, int i5) {
        ImmutableList of;
        1G1 r0 = this.A00;
        ImmutableList immutableList = this.A06;
        C2j0 c2j0 = (C2j0) 1Bi.A05(C2j0.class, (Class) null);
        1Bn.A0H(3yW.class, (Class) null);
        java.util.Map map = (java.util.Map) ((2Tn) 1Lo.A04(((1Iw) c1qb).A0D, r0, (1BY) null, 17028)).A04.get(2To.A0B);
        try {
            long parseLong = Long.parseLong(r0.A02);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            2eG r02 = (2eG) 1Bi.A03(66489);
            double Ai7 = i == 0 ? ((2yD) r02.A01.A00.get()).Ai7(37157291090051359L) : ((2yD) r02.A01.A00.get()).Ai7(37157291089920286L);
            while (true) {
                if (i >= immutableList.size() || i > i2) {
                    break;
                }
                2kQ r03 = (2kQ) immutableList.get(i);
                if (r03.A00 == 0) {
                    3xR r04 = r03.A02;
                    r04.getClass();
                    if (r04.A04() != null) {
                        String str = r04.A04().A13;
                        if (((map == null || !map.containsKey(str)) ? 1.0d : ((Number) map.get(str)).floatValue()) >= Ai7) {
                            builder.m11011add((Object) ThreadKey.A0H(Long.parseLong(str), parseLong));
                        }
                    }
                }
                i++;
            }
            of = builder.build();
        } catch (NumberFormatException unused) {
            of = ImmutableList.of();
        }
        if (of.isEmpty()) {
            return;
        }
        c2j0.A01(new C5bs(of));
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A06;
        MigColorScheme migColorScheme = this.A05;
        2Yr r0 = new 2Yr();
        C2hf A0I = C2he.A0I(c1qb);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) new Pair(migColorScheme, it.next()));
        }
        A0I.A06(builder.build());
        Integer num = 0S2.A00;
        A0I.A04(2Yg.A02(c1qb, C2kl.class, num, "FriendsInboxUnitSection", (Object[]) null, 947264300));
        A0I.A03(2Yg.A02(c1qb, C2kl.class, num, "FriendsInboxUnitSection", (Object[]) null, 851046848));
        A0I.A05(2Yg.A02(c1qb, C2kl.class, num, "FriendsInboxUnitSection", (Object[]) null, 239257522));
        r0.A00(A0I);
        return r0.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v126, types: [X.2hj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kl.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }
}
