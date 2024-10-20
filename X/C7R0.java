package X;

import com.facebook.messaging.threadview.params.ThreadViewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7R0, reason: invalid class name */
/* loaded from: 7R0.class */
public final class C7R0 {
    public static void A00(7R1 r301, ThreadViewParams threadViewParams, AnonymousClass201 anonymousClass201) {
        String str;
        int i;
        C7R2 c7r2 = r301.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c7r2.A0B;
        String A00 = 1BJ.A00(1384);
        r0.A08("com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement);
        try {
            ArrayList arrayList = new ArrayList(C7R2.A00(c7r2));
            try {
                if (C7R2.A04(c7r2)) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.threadview.initparams.core.implementations.navigationtrigger.NavigationTriggerProviderImplementation";
                    r0.A0A("com.facebook.messaging.threadview.initparams.plugins.core.implementations.navigationtrigger.NavigationTriggerProviderImplementation", str, "com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", i, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "com.facebook.messaging.threadview.initparams.plugins.core.ThreadviewInitparamsCoreKillSwitch", A00);
                    try {
                        7RC r02 = (7RC) c7r2.A03.A00.getValue();
                        11T.A0I(r02, "null cannot be cast to non-null type com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProvider<out com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata>");
                        arrayList.add(r02);
                        r0.A04((Exception) null, str, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (C7R2.A05(c7r2)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadview.initparams.plugins.core.implementations.threadviewsource.ThreadViewSourceProviderImplementation", "messaging.threadview.initparams.core.implementations.threadviewsource.ThreadViewSourceProviderImplementation", "com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", andIncrement2, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "com.facebook.messaging.threadview.initparams.plugins.core.ThreadviewInitparamsCoreKillSwitch", A00);
                    7RE r03 = (7RE) c7r2.A04.A00.getValue();
                    11T.A0I(r03, "null cannot be cast to non-null type com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProvider<out com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata>");
                    arrayList.add(r03);
                    r0.A04((Exception) null, "messaging.threadview.initparams.core.implementations.threadviewsource.ThreadViewSourceProviderImplementation", "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement2);
                }
                if (C7R2.A01(c7r2)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.dma.initparams.plugins.implementations.dmanotconsented.DmaConsentImplementation", "messaging.dma.initparams.implementations.dmanotconsented.DmaConsentImplementation", "com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", andIncrement3, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "com.facebook.messaging.dma.initparams.plugins.implementations.DmaInitparamsImplementationsKillSwitch", A00);
                    7RG r04 = (7RG) c7r2.A00.A00.getValue();
                    11T.A0I(r04, "null cannot be cast to non-null type com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProvider<out com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata>");
                    arrayList.add(r04);
                    r0.A04((Exception) null, "messaging.dma.initparams.implementations.dmanotconsented.DmaConsentImplementation", "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement3);
                }
                if (C7R2.A02(c7r2)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.search.aiagent.plugins.implementations.openandsend.OpenAndSendProviderImplementation", "messaging.search.aiagent.implementations.openandsend.OpenAndSendProviderImplementation", "com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", andIncrement4, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "com.facebook.messaging.search.aiagent.plugins.implementations.SearchAiagentImplementationsKillSwitch", A00);
                    7Vx r05 = (7Vx) c7r2.A01.A00.getValue();
                    11T.A0I(r05, "null cannot be cast to non-null type com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProvider<out com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata>");
                    arrayList.add(r05);
                    r0.A04((Exception) null, "messaging.search.aiagent.implementations.openandsend.OpenAndSendProviderImplementation", "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement4);
                }
                if (C7R2.A03(c7r2)) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.search.aiagent.implementations.sendonwelcomemessage.SendOnWelcomeMessageProviderImplementation";
                    r0.A0A("com.facebook.messaging.search.aiagent.plugins.implementations.sendonwelcomemessage.SendOnWelcomeMessageProviderImplementation", str, "com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", i, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", "com.facebook.messaging.search.aiagent.plugins.implementations.SearchAiagentImplementationsKillSwitch", A00);
                    7Vz r06 = (7Vz) c7r2.A02.A00.getValue();
                    11T.A0I(r06, "null cannot be cast to non-null type com.facebook.messaging.threadview.initparams.plugins.interfaces.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProvider<out com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata>");
                    arrayList.add(r06);
                    r0.A04((Exception) null, str, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, i);
                }
                while (arrayList.size() < C7R2.A00(c7r2)) {
                    arrayList.add(null);
                }
                r0.A02((Exception) null, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7RD c7rd = (C7RD) it.next();
                    11T.A0D(c7rd);
                    anonymousClass201.A02(c7rd.Asi(), c7rd.AxU(threadViewParams));
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadview.initparams.threadinitparamsmetadataprovider.ThreadInitParamsMetadataProviderInterfaceSpec", A00, andIncrement);
            throw th2;
        }
    }
}
