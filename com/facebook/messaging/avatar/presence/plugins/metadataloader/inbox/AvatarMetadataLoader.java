package com.facebook.messaging.avatar.presence.plugins.metadataloader.inbox;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.AnonymousClass207;
import X.C2f0;
import X.C2nj;
import X.C3d3;
import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.presence.plugins.metadataloader.inbox.AvatarMetadataLoader;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: AvatarMetadataLoader.class */
public final class AvatarMetadataLoader {
    public static final AnonymousClass207 A04;
    public final 1Br A00;
    public final C3d3 A01;
    public final Context A02;
    public final FbUserSession A03;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A04 = new AnonymousClass207(C2f0.class, "AvatarMetadataLoader");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.3d3] */
    public AvatarMetadataLoader(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 65856);
        this.A01 = new C2nj() { // from class: X.3d3
            @Override // X.C2nj
            public AnonymousClass207 Asi() {
                return AvatarMetadataLoader.A04;
            }

            @Override // X.C2nj
            public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
                11T.A0F(threadSummary, 0);
                AvatarMetadataLoader avatarMetadataLoader = AvatarMetadataLoader.this;
                AnonymousClass207 anonymousClass207 = AvatarMetadataLoader.A04;
                C6ks c6ks = (C6ks) 1Br.A0B(avatarMetadataLoader.A00);
                ThreadKey threadKey = threadSummary.A0n;
                11T.A0A(threadKey);
                7QI A01 = c6ks.A01(threadKey);
                if (A01 != null) {
                    return new C2f0(A01.A02, A01.A01);
                }
                return null;
            }
        };
    }
}
