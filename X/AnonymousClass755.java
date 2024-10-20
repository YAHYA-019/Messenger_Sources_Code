package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.755, reason: invalid class name */
/* loaded from: 755.class */
public final class AnonymousClass755 implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final ThreadKey A02;
    public final C5j5 A03;
    public final AnonymousClass753 A04;
    public final AnonymousClass754 A05;
    public final 4kB A06;
    public final 6wV A07;

    public AnonymousClass755(C74x c74x) {
        AnonymousClass753 anonymousClass753 = c74x.A02;
        anonymousClass753.getClass();
        this.A04 = anonymousClass753;
        this.A06 = c74x.A04;
        ThreadKey threadKey = c74x.A00;
        threadKey.getClass();
        this.A02 = threadKey;
        AnonymousClass754 anonymousClass754 = c74x.A03;
        anonymousClass754.getClass();
        this.A05 = anonymousClass754;
        C5j5 c5j5 = c74x.A01;
        c5j5.getClass();
        this.A03 = c5j5;
        6wV r0 = c74x.A05;
        r0.getClass();
        this.A07 = r0;
        this.A00 = c74x.A06;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class, 7Ae.class, 7CY.class, 7An.class, 7CI.class, 7CZ.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "EditMessagePlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [X.6Sh] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        AnonymousClass753 anonymousClass753;
        C5fv c5fv;
        Object obj;
        if (r305 instanceof 7CI) {
            if (!this.A01) {
                this.A01 = true;
            }
            7CI r0 = (7CI) r305;
            6wV r02 = this.A07;
            AnonymousClass753 anonymousClass7532 = this.A04;
            C5j5 c5j5 = this.A03;
            11T.A0F(r304, 0);
            11T.A0F(r0, 1);
            11T.A0F(c77n, 2);
            String ALh = c5j5.ALh(r0.A01, 195771409088126L);
            11T.A0A(ALh);
            c77n.ClL(new 78V(r0.A00, ALh, false, true));
            anonymousClass7532.D1i();
            r02.CvI(ALh);
            obj = 7As.A02;
        } else {
            if (r305 instanceof 7CZ) {
                if (!this.A01) {
                    this.A01 = true;
                }
                6wV r03 = this.A07;
                anonymousClass753 = this.A04;
                ThreadKey threadKey = this.A02;
                AnonymousClass754 anonymousClass754 = this.A05;
                78V AUP = c77n.AUP(78V.class);
                11T.A0F(r304, 0);
                11T.A0F(AUP, 6);
                AnonymousClass754.A00(threadKey, anonymousClass754, AUP.A00, "edit_message_cancel", "long_tap", 7EK.A00);
                c77n.ClL(new 78V((C5fv) null, (String) null, false, false));
                r03.CvI("");
            } else {
                if (r305 instanceof 7Ae) {
                    if (!this.A01) {
                        this.A01 = true;
                    }
                    6wV r04 = this.A07;
                    78V AUP2 = c77n.AUP(78V.class);
                    11T.A0F(AUP2, 3);
                    boolean z = AUP2.A03;
                    if (z) {
                        CharSequence text = r04.getText();
                        String str = AUP2.A01;
                        boolean A00 = C7m3.A00(str, text);
                        if (A00 != AUP2.A02) {
                            c77n.ClL(new 78V(AUP2.A00, str, A00, z));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (r305 instanceof 7CY) {
                    if (!this.A01) {
                        this.A01 = true;
                    }
                    ThreadKey threadKey2 = this.A02;
                    6wV r05 = this.A07;
                    anonymousClass753 = this.A04;
                    AnonymousClass754 anonymousClass7542 = this.A05;
                    4kB r06 = this.A06;
                    78V AUP3 = c77n.AUP(78V.class);
                    11T.A0F(r304, 0);
                    11T.A0F(AUP3, 6);
                    if (!AUP3.A03 || (c5fv = AUP3.A00) == null) {
                        return;
                    }
                    AnonymousClass754.A00(threadKey2, anonymousClass7542, c5fv, "edit_message", "long_tap", 7EK.A00);
                    String obj2 = 0CU.A06(r05.getText().toString()).toString();
                    if (!C7m3.A00(AUP3.A01, obj2)) {
                        return;
                    }
                    String str2 = ((C5fu) c5fv).A0B;
                    if (str2 == null) {
                        str2 = 4YU.A0s();
                    }
                    7Gc r07 = new 7Gc();
                    r07.A02("edit");
                    r07.A03("composer_text_tab");
                    r07.A01(AwakeTimeSinceBootClock.INSTANCE.nowNanos());
                    int hashCode = str2.hashCode();
                    r07.A00(hashCode);
                    7FI.A02(r304, new 7AT(r07));
                    7Gc r08 = new 7Gc();
                    r08.A00(hashCode);
                    7FI.A02(r304, new 7AQ(r08));
                    anonymousClass753.Cka(threadKey2, r06, c5fv, obj2, str2);
                    r05.CvI("");
                    r05.CuQ(0, 0);
                    c77n.ClL(new 78V((C5fv) null, (String) null, false, false));
                } else {
                    if (!(r305 instanceof 7An)) {
                        if (r305 instanceof 7AO) {
                            Object obj3 = ((7AO) r305).A00;
                            if (obj3 instanceof C5Sk) {
                                if (!this.A01) {
                                    this.A01 = true;
                                }
                                11T.A0F((C5Sk) obj3, 0);
                                7EK.A00 = r0.A04.size() + 1;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!this.A01) {
                        this.A01 = true;
                    }
                    6wV r09 = this.A07;
                    AnonymousClass753 anonymousClass7533 = this.A04;
                    78V AUP4 = c77n.AUP(78V.class);
                    11T.A0F(r304, 0);
                    11T.A0F(AUP4, 3);
                    if (!AUP4.A03) {
                        return;
                    }
                    r09.CvI("");
                    anonymousClass7533.ARS();
                    c77n.ClL(new 78V((C5fv) null, (String) null, false, false));
                    7FI.A00(r304);
                    obj = new Object();
                }
            }
            anonymousClass753.ARS();
            obj = new Object();
        }
        7FI.A02(r304, obj);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
