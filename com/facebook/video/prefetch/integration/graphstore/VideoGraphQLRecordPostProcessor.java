package com.facebook.video.prefetch.integration.graphstore;

import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zT;
import X.AnonymousClass046;
import X.ErM;
import X.G5O;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Executor;

/* loaded from: VideoGraphQLRecordPostProcessor.class */
public final class VideoGraphQLRecordPostProcessor {
    public static final ErM Companion = new Object();
    public static final AnonymousClass046 unexpectedEventReporter = (AnonymousClass046) 1Bn.A0A(16669);
    public static final 1Br videoPrefetchProfileHelper$delegate = 1Bq.A00(116236);
    public static final 1Br adminMobileConfig$delegate = 7zM.A0N();

    public static final void process(String str, String str2, String str3, boolean z) {
        ErM erM = Companion;
        7zT.A1S(str, str2, str3);
        if (!1Br.A07(adminMobileConfig$delegate).AZk(72340915850711325L)) {
            erM.A00(str, str2);
            return;
        }
        11T.A0A(FbInjector.A00());
        1Br A00 = 1Bu.A00(16454);
        ((Executor) A00.get()).execute(new G5O(str, str2, str3, z));
    }
}
