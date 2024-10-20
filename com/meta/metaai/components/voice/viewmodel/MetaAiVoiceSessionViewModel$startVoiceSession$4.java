package com.meta.metaai.components.voice.viewmodel;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Xs;
import X.2Zs;
import X.2aK;
import X.2aN;
import X.4ZJ;
import X.8DP;
import X.9lF;
import X.AJM;
import X.AJO;
import X.AJX;
import X.AnonymousClass001;
import X.C2615Gj4;
import X.C4G3;
import X.GvZ;
import X.Gvb;
import X.Gvc;
import X.HDk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.facebook.rp.platform.metaai.messenger.MessengerMetaAiRealTimeSessionController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: MetaAiVoiceSessionViewModel$startVoiceSession$4.class */
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ boolean $isMetaAiVideoEnabled;
    public final /* synthetic */ boolean $keepCurrentSettings;
    public final /* synthetic */ LifecycleOwner $lifecycleOwner;
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ long $metaAiId;
    public final /* synthetic */ Function1 $requestPermissions;
    public Object L$0;
    public int label;
    public final /* synthetic */ 8DP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSessionViewModel$startVoiceSession$4(Context context, LifecycleOwner lifecycleOwner, 8DP r304, String str, String str2, 0DR r307, Function1 function1, long j, boolean z, boolean z2) {
        super(2, r307);
        this.this$0 = r304;
        this.$metaAiId = j;
        this.$entryPoint = str;
        this.$context = context;
        this.$localCallId = str2;
        this.$requestPermissions = function1;
        this.$isMetaAiVideoEnabled = z;
        this.$keepCurrentSettings = z2;
        this.$lifecycleOwner = lifecycleOwner;
    }

    public final 0DR create(Object obj, 0DR r303) {
        8DP r0 = this.this$0;
        long j = this.$metaAiId;
        String str = this.$entryPoint;
        return new MetaAiVoiceSessionViewModel$startVoiceSession$4(this.$context, this.$lifecycleOwner, r0, str, this.$localCallId, r303, this.$requestPermissions, j, this.$isMetaAiVideoEnabled, this.$keepCurrentSettings);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        9lF r312;
        C4G3 c4g3;
        AJX ajm;
        Object A00;
        Object value;
        9lF r0;
        Object obj2 = obj;
        0Ds r02 = 0Ds.A02;
        int i = this.label;
        int i2 = 3;
        if (i == 0) {
            0Dt.A00(obj);
            r312 = (9lF) this.this$0.A0A.getValue();
            MessengerMetaAiRealTimeSessionController messengerMetaAiRealTimeSessionController = this.this$0.A03;
            long j = this.$metaAiId;
            String str = this.$entryPoint;
            if (str == null) {
                str = "meta_ai_voice_sheet";
            }
            C2615Gj4 c2615Gj4 = new C2615Gj4(this.$context, str, this.$localCallId, this.$requestPermissions, j, this.$isMetaAiVideoEnabled);
            this.L$0 = r312;
            this.label = 1;
            obj2 = messengerMetaAiRealTimeSessionController.A00(c2615Gj4, this);
            if (obj2 == r02) {
                return r02;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj2);
                return 04S.A00;
            }
            r312 = (9lF) this.L$0;
            0Dt.A00(obj);
        }
        GvZ gvZ = (HDk) obj2;
        if (gvZ instanceof GvZ) {
            8DP r03 = this.this$0;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = gvZ.A00;
            r03.A00 = metaAiRsysSdkRealTimeSession;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A00.A01 = 50;
            }
            0Xs r04 = r03.A0A;
            do {
                value = r04.getValue();
                r0 = (9lF) value;
            } while (!r04.AGt(value, new 9lF(r0.A00, r0.A01, r0.A02, r0.A03, (CharSequence) null, r0.A05, r0.A06, true, r0.A0A, r0.A08, true, r0.A0B, r0.A09)));
            r03.A05.invoke();
            if (this.$keepCurrentSettings) {
                8DP r05 = this.this$0;
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession2 = r05.A00;
                if (metaAiRsysSdkRealTimeSession2 != null) {
                    metaAiRsysSdkRealTimeSession2.A02(!r312.A0A);
                }
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession3 = r05.A00;
                if (metaAiRsysSdkRealTimeSession3 != null) {
                    metaAiRsysSdkRealTimeSession3.A01(!r312.A08);
                }
            }
            Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AJO ajo = new AJO(this.$context, this.$lifecycleOwner, this.this$0, null, this.$requestPermissions, this.$metaAiId, this.$isMetaAiVideoEnabled);
            this.L$0 = null;
            this.label = 2;
            A00 = RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2) ajo, (0DR) this);
        } else {
            if (gvZ instanceof Gvb) {
                2Zs r06 = 2aN.A00;
                c4g3 = 4ZJ.A00;
                ajm = new AJX(this.$context, this.this$0, (0DR) null, 44);
                this.L$0 = null;
            } else {
                boolean z = gvZ instanceof Gvc;
                2Zs r07 = 2aN.A00;
                c4g3 = 4ZJ.A00;
                if (z) {
                    ajm = new AJX(this.$context, this.this$0, (0DR) null, 45);
                    this.L$0 = null;
                    i2 = 4;
                } else {
                    ajm = new AJM(this.$context, this.$lifecycleOwner, this.this$0, null, this.$requestPermissions, this.$metaAiId, this.$isMetaAiVideoEnabled);
                    this.L$0 = null;
                    i2 = 5;
                }
            }
            this.label = i2;
            A00 = 2aK.A00(this, c4g3, ajm);
        }
        if (A00 == r02) {
            return r02;
        }
        return 04S.A00;
    }
}
