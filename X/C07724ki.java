package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.4ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ki.class */
public final class C07724ki extends AbstractC07494k1 {
    public boolean A00;
    public boolean A01;
    public final ImmutableList A02;

    public C07724ki(ImmutableList immutableList) {
        if (!(!immutableList.isEmpty())) {
            throw AnonymousClass001.A0L("You must provide at least 1 source");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            InterfaceC07554k7 interfaceC07554k7 = (InterfaceC07554k7) it.next();
            11T.A0D(interfaceC07554k7);
            11T.A0F(interfaceC07554k7, 0);
            builder.add(new C5jr(this, interfaceC07554k7));
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        this.A02 = build;
    }

    public static final void A00(C07724ki c07724ki) {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass201 A00 = C1zz.A00();
        Iterator it = c07724ki.A02.iterator();
        while (it.hasNext()) {
            C5jr c5jr = (C5jr) it.next();
            AnonymousClass207 Asi = c5jr.A00.Asi();
            11T.A0I(Asi, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap.Key<T of com.facebook.xapp.messaging.datafetch.common.MemoizedObservableDataSource>");
            Object obj = c5jr.A03.get();
            if (obj != null) {
                Object cast = Asi.A00.cast(obj);
                if (cast == null) {
                    throw 1BK.A0h();
                }
                A00.A01(Asi, cast);
            }
        }
        c07724ki.A05(A00.A00());
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        synchronized (this) {
            this.A01 = true;
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            InterfaceC07554k7 interfaceC07554k7 = ((C5jr) it.next()).A00;
            if (interfaceC07554k7 instanceof InterfaceC07544k6) {
                ((InterfaceC07544k6) interfaceC07554k7).Cgt(i);
            }
        }
        synchronized (this) {
            this.A01 = false;
        }
        A00(this);
    }
}
