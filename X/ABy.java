package X;

import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: ABy.class */
public final class ABy implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 77H A02;
    public final /* synthetic */ 90S A03;
    public final /* synthetic */ ImmutableList.Builder A04;
    public final /* synthetic */ SettableFuture A05;

    public ABy(77H r302, 90S r303, ImmutableList.Builder builder, SettableFuture settableFuture, int i, long j) {
        this.A04 = builder;
        this.A03 = r303;
        this.A00 = i;
        this.A02 = r302;
        this.A05 = settableFuture;
        this.A01 = j;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        0fH.A0r("MsysCustomizeThreadThemeFetcher", "Failed to validate fetched theme", th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        if (1BK.A1X(obj, true)) {
            ImmutableList.Builder builder = this.A04;
            90S r0 = this.A03;
            11T.A0D(r0);
            builder.m11011add((Object) 6qF.A01((0AC) 1Br.A0B(this.A02.A02), r0, this.A00));
        }
        if (this.A00 == 1qX.A00(this.A03) - 1) {
            ImmutableList build = this.A04.build();
            11T.A0D(build);
            long j = this.A01;
            Iterator it = build.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((ThreadThemeInfo) obj2).A06 == j) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) obj2;
            if (threadThemeInfo == null) {
                long j2 = -1;
                threadThemeInfo = new ThreadThemeInfo(null, null, null, null, null, null, "", null, null, AnonymousClass001.A0v(), 0, 0, -1, 0, 0, 0, j2, j2, false, false);
            }
            9OT r02 = (9OT) 1Br.A0B(this.A02.A04);
            ArrayList<ThreadThemeInfo> A0s = AnonymousClass001.A0s();
            Iterator it2 = build.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((ThreadThemeInfo) next).A0I) {
                    A0s.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A0s));
            for (ThreadThemeInfo threadThemeInfo2 : A0s) {
                Long valueOf = Long.valueOf(threadThemeInfo2.A06);
                2qQ A0o = 7zL.A0o();
                A0o.A01 = threadThemeInfo2;
                A0o.A00 = threadThemeInfo2;
                linkedHashMap.put(valueOf, A0o);
            }
            ArrayList<ThreadThemeInfo> A0s2 = AnonymousClass001.A0s();
            Iterator it3 = build.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                ThreadThemeInfo threadThemeInfo3 = (ThreadThemeInfo) next2;
                if (threadThemeInfo3.A0I && linkedHashMap.containsKey(Long.valueOf(threadThemeInfo3.A06))) {
                    A0s2.add(next2);
                }
            }
            for (ThreadThemeInfo threadThemeInfo4 : A0s2) {
                2qQ r03 = (2qQ) linkedHashMap.get(Long.valueOf(threadThemeInfo4.A06));
                if (r03 != null) {
                    C5yg A00 = threadThemeInfo4.A00();
                    if (A00 == C5yg.A04) {
                        r03.A01 = threadThemeInfo4;
                    } else if (A00 == C5yg.A02) {
                        r03.A00 = threadThemeInfo4;
                    }
                }
            }
            ImmutableList.Builder builder2 = ImmutableList.builder();
            Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
            while (A0x.hasNext()) {
                builder2.m11011add(7zQ.A0m(r02.A00).Ci4(((2qQ) AnonymousClass001.A0z(A0x).getValue()).A00()));
            }
            this.A05.set(new 8Lu(threadThemeInfo, 1Fj.A01(builder2)));
        }
    }
}
