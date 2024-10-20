package X;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.Constants;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.quickpromotion.plugins.threadviewmsys.banner.ThreadViewMsysQpBanner;
import com.facebook.particles.ParticleSystemView;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: AHb.class */
public final class AHb implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AHb(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        1FX A02;
        ThreadSummary threadSummary;
        boolean z;
        FileInputStream fileInputStream;
        IllegalStateException th;
        switch (this.A00) {
            case 0:
                9UU r0 = (9UU) 1Br.A0B(((Hfr) this.A02).A03);
                List list = (List) this.A01;
                A02 = 7zO.A0i(list, 0);
                if (!list.isEmpty()) {
                    String A14 = 1BK.A14(list, 0);
                    String str = (String) 0QD.A0J(list, 1);
                    if (r0.A00 == 0) {
                        C0il.A0C(AnonymousClass000.A00(56), 16);
                        C0il.A0C(AnonymousClass000.A00(36), 16);
                        C0il.A0C(AnonymousClass000.A00(59), 16);
                        r0.A00 = 1;
                    }
                    1Br.A0D(r0.A02, new InV(r0, A02, A14, str, 1), ((7US) 4YU.A0n(1Br.A03(r0.A04), r0.A01, 67830)).A00());
                    break;
                } else {
                    C0ty c0ty = C0ty.A00;
                    String A0t = 1BK.A0t();
                    11T.A0D(A0t);
                    A02.set(new 8Lq(A0t, "Skipped", "Null input", c0ty));
                    break;
                }
            case 1:
                2Ca r02 = ((5HZ) this.A01).A07;
                MediaResource mediaResource = (MediaResource) this.A02;
                Uri uri = mediaResource.A0E;
                1aD A00 = 2Ca.A00(r02, mediaResource.A0l);
                try {
                    A00.A01.A03();
                    z = true;
                } catch (Throwable unused) {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                Context context = r02.A01;
                File file = new File(context.getFilesDir(), AnonymousClass001.A0h(AnonymousClass001.A0n("attachement"), System.currentTimeMillis()));
                if (0CO.A04(uri)) {
                    1OW A0B = ((2Ff) r02.A02.get()).A0B(2IA.A01(uri).A04(), CallerContext.A07(context.getClass()));
                    try {
                        2EU r03 = (2EU) 1Yz.A00(H7M.A00(A0B));
                        if (r03 != null) {
                            int size = ((4dR) r03.A09()).size();
                            byte[] bArr = new byte[size];
                            try {
                                ((4dR) r03.A09()).read(0, bArr, 0, size);
                                r03.close();
                                new ByteArrayInputStream(bArr);
                            } catch (Throwable th2) {
                                th = th2;
                                r03.close();
                            }
                        } else {
                            th = AnonymousClass001.A0N(4YT.A00(610));
                        }
                        throw th;
                    } finally {
                        A0B.AGD();
                    }
                }
                String path = uri.getPath();
                path.getClass();
                fileInputStream = new FileInputStream(path);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        3DK A01 = A00.A00.A01(2Ca.A06, bufferedOutputStream);
                        try {
                            byte[] bArr2 = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP];
                            while (true) {
                                int read = fileInputStream.read(bArr2);
                                if (read == -1) {
                                    Uri fromFile = Uri.fromFile(file);
                                    A01.close();
                                    bufferedOutputStream.close();
                                    fileInputStream.close();
                                    return fromFile;
                                }
                                A01.write(bArr2, 0, read);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                        throw th3;
                    } finally {
                        7kF.A00(th3, th);
                    }
                }
            case 2:
                ThreadViewMsysQpBanner threadViewMsysQpBanner = (ThreadViewMsysQpBanner) this.A02;
                2bM r04 = (2bM) 1Br.A0B(threadViewMsysQpBanner.A05);
                ThreadSummary threadSummary2 = threadViewMsysQpBanner.A01;
                int i = 11154;
                if (ThreadKey.A0a(threadSummary2 != null ? threadSummary2.A0n : null)) {
                    i = 10206;
                }
                A02 = r04.A02((InterstitialTrigger) this.A01, i);
                break;
            case 3:
                6IQ r05 = (6IQ) this.A01;
                ((9Zj) r05.A0L.get()).A00(r05.A0D, (ThreadSummary) this.A02);
                return null;
            case 4:
                6IQ r06 = (6IQ) this.A01;
                AtomicReference atomicReference = r06.A0N;
                if (!1MG.A00(atomicReference, 6IR.A03, 6IR.A01)) {
                    return null;
                }
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                C5yq A002 = ((C5ym) r06.A0G.get()).A00(fbUserSession, r06.A03, 0S2.A0C);
                r06.A01 = A002;
                if (A002 != null && (threadSummary = r06.A03) != null && threadSummary.A0n != null) {
                    C5yl c5yl = C5yl.A0G;
                    C1pq.A08("fRXLaunchLocation", A002);
                    7Pz.A03((7Pz) 1Lo.A04(r06.A0C, fbUserSession, (1BY) null, 68478), new C7Q1(A002, threadSummary, c5yl), true);
                }
                atomicReference.set(6IR.A02);
                return null;
            case 5:
                7Em r07 = (7Em) this.A02;
                List list2 = (List) this.A01;
                ArrayList A0z = 1BL.A0z(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A0z.add(((C82g) it.next()).A03);
                }
                7En r08 = r07.A00;
                if (r08 != null) {
                    if (r08.A01 == null) {
                        FrameLayout frameLayout = r08.A00;
                        ParticleSystemView particleSystemView = new ParticleSystemView(frameLayout.getContext());
                        r08.A01 = particleSystemView;
                        frameLayout.addView(particleSystemView);
                    }
                    9kS r09 = (9kS) r08.A02.get();
                    ParticleSystemView particleSystemView2 = r08.A01;
                    particleSystemView2.getClass();
                    LXb lXb = 9kS.A03;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int i2 = 0;
                    do {
                        String A142 = 1BK.A14(A0z, r09.A02.nextInt(A0z.size()));
                        HashMap hashMap = r09.A01;
                        Object obj = hashMap.get(A142);
                        LXb lXb2 = 9kS.A03;
                        if (obj != lXb2) {
                            Object obj2 = obj;
                            if (obj == null) {
                                C6ka AjQ = ((C22a) r09.A00.get()).AjQ(A142, 6qG.A00);
                                if (AjQ == null) {
                                    hashMap.put(A142, lXb2);
                                } else {
                                    LXb lXb3 = new LXb(Collections.singletonList(AjQ));
                                    lXb3.A05 = new LXe(-30.0f, 30.0f);
                                    float f = -280.0f;
                                    float f2 = -120.0f;
                                    if (C3Pn.A00.contains(A142)) {
                                        f = 120.0f;
                                        f2 = 200.0f;
                                    }
                                    lXb3.A00 = new LXe(f, f2);
                                    lXb3.A04 = new LXd(-15.0f, 15.0f);
                                    lXb3.A00(new LXe(0.5f, 1.5f));
                                    hashMap.put(A142, lXb3);
                                    obj2 = lXb3;
                                }
                            }
                            builder.m11011add(obj2);
                        }
                        i2++;
                    } while (i2 < 30);
                    1Du it2 = builder.build().iterator();
                    while (it2.hasNext()) {
                        particleSystemView2.A02((LXb) it2.next());
                    }
                }
                return 04S.A00;
            default:
                return Boolean.valueOf(((AaP) this.A01).CXV(((C6t9) this.A02).A01));
        }
        return A02.get();
    }
}
