package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Iby.class */
public final class Iby implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public Iby(SettableFuture settableFuture, int i) {
        this.A00 = i;
        switch (i) {
            case 8:
            case 16:
            case 33:
                this.A01 = settableFuture;
                return;
            default:
                this.A01 = settableFuture;
                return;
        }
    }

    public Iby(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(MailboxObservable mailboxObservable, Object obj, int i) {
        mailboxObservable.addResultCallback(new Iby(obj, i));
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
    /* JADX WARN: Not initialized variable reg: 307, insn: 0x08de: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r307 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:47:0x08de */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Iby.onCompletion(java.lang.Object):void");
    }
}
