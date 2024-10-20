package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.75i, reason: invalid class name */
/* loaded from: 75i.class */
public final class C75i implements 6xM {
    public boolean A01;
    public final FbUserSession A02;
    public final C6xN A03 = new C6xN();
    public final C6xN A04 = new C6xN();
    public HashSet A00 = null;

    public C75i(FbUserSession fbUserSession) {
        this.A02 = fbUserSession;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A03;
        11T.A0F(c6xN, 0);
        c6xN.A00 = new 2PF(((2yD) 1Bi.A03(16385)).Auy(36605520932510939L));
        this.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7BN.class, 7BX.class, 6Sv.class, 6Sg.class, 7Bd.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "HotLikeAnimationPlugin";
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 311, insn: 0x04a5: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r311 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:89:0x04a5 */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75i.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
