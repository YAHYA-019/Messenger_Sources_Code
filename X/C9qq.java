package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* renamed from: X.9qq, reason: invalid class name */
/* loaded from: 9qq.class */
public final class C9qq implements Observer {
    public final int A00;
    public final Object A01;

    public C9qq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(LifecycleOwner lifecycleOwner, LiveData liveData, int i) {
        liveData.observe(lifecycleOwner, new C9qq(lifecycleOwner, i));
    }

    public static void A01(LifecycleOwner lifecycleOwner, LiveData liveData, Object obj, int i) {
        liveData.observe(lifecycleOwner, new C9qq(obj, i));
    }

    public static void A02(LiveData liveData, MediatorLiveData mediatorLiveData, Object obj, int i) {
        mediatorLiveData.addSource(liveData, new C9qq(obj, i));
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
    /* JADX WARN: Not initialized variable reg: 311, insn: 0x37ea: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r311 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:664:0x37ea */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 15930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9qq.onChanged(java.lang.Object):void");
    }
}
