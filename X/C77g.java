package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* renamed from: X.77g, reason: invalid class name */
/* loaded from: 77g.class */
public final class C77g extends C00q implements C00m {
    public final /* synthetic */ boolean $enableReuseOptimisticUri;
    public final /* synthetic */ C01i $ephemeralImagePostProcessorFactoryProvider;
    public final /* synthetic */ 6oP $overlayFactory;
    public final /* synthetic */ 6oN $photoRetryCallback;
    public final /* synthetic */ boolean $shouldEnableLottieRendering;
    public final /* synthetic */ 0Be $stickerLoadedCallback;
    public final /* synthetic */ C6qu $this_stickerMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77g(C6qu c6qu, 6oP r303, 6oN r304, C01i c01i, 0Be r306, boolean z, boolean z2) {
        super(0);
        this.$this_stickerMessageFeature = c6qu;
        this.$ephemeralImagePostProcessorFactoryProvider = c01i;
        this.$shouldEnableLottieRendering = z;
        this.$overlayFactory = r303;
        this.$photoRetryCallback = r304;
        this.$enableReuseOptimisticUri = z2;
        this.$stickerLoadedCallback = r306;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C6qv c6qv = this.$this_stickerMessageFeature.A00;
        final 1pK Alf = c6qv.Alf();
        final 6yM Ad4 = c6qv.Ad4();
        final FbUserSession Alj = c6qv.Alj();
        final C66e AwD = c6qv.AwD();
        final 7Jt r0 = (7Jt) this.$ephemeralImagePostProcessorFactoryProvider.getValue();
        C6qv c6qv2 = this.$this_stickerMessageFeature.A00;
        final boolean BAl = c6qv2.BAl();
        final boolean z = this.$shouldEnableLottieRendering;
        final 6oP r02 = this.$overlayFactory;
        final 6oN r03 = this.$photoRetryCallback;
        final C6yo AaY = c6qv2.AaY();
        final boolean z2 = this.$enableReuseOptimisticUri;
        final 0Be r04 = this.$stickerLoadedCallback;
        return new AnonymousClass703(Alf, Alj, AaY, Ad4, r0, r02, r03, AwD, r04, BAl, z, z2) { // from class: X.878
            public final LifecycleOwner A00;
            public final FbUserSession A01;
            public final C6ze A02;
            public final C6yo A03;
            public final 6yJ A04;
            public final 7Jt A05;
            public final 6oP A06;
            public final 6oN A07;
            public final C66e A08;
            public final 0Be A09;
            public final boolean A0A;
            public final boolean A0B;
            public final C01i A0C;
            public final C01i A0D;
            public final boolean A0E;

            {
                7zT.A1W(Alf, Ad4, Alj, AwD);
                11T.A0F(AaY, 10);
                this.A00 = Alf;
                this.A04 = Ad4;
                this.A01 = Alj;
                this.A08 = AwD;
                this.A05 = r0;
                this.A0B = BAl;
                this.A0E = z;
                this.A06 = r02;
                this.A07 = r03;
                this.A03 = AaY;
                this.A0A = z2;
                this.A09 = r04;
                this.A02 = C6ze.A0R;
                C03i c03i = C03i.A03;
                this.A0D = C01g.A00(c03i, new AQU(this, 12));
                this.A0C = C01g.A00(c03i, new AQU(this, 11));
            }

            @Override // X.AnonymousClass703
            public /* bridge */ /* synthetic */ C6zf B77() {
                return this.A02;
            }

            @Override // X.AnonymousClass703
            public 1LI Cfc(C1qb c1qb, C5j5 c5j5, 5vW r304, List list, int i) {
                7zT.A1S(c1qb, c5j5, r304);
                11T.A0F(list, 4);
                return (11T.A0O(((C5v9) ((5vV) r304).A00).A00.A0D, "text/json") && this.A0E) ? ((AAM) this.A0C.getValue()).Cfc(c1qb, c5j5, r304, list, i) : ((AnonymousClass879) this.A0D.getValue()).Cfc(c1qb, c5j5, r304, list, i);
            }
        };
    }
}
