package X;

import android.view.View;
import com.facebook.messaging.audio.composer.AudioComposerContentView;
import com.facebook.messaging.audio.composer.VoiceClipKeyboardView;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.widget.text.SimpleVariableTextLayoutView;

/* loaded from: Ilf.class */
public final class Ilf implements 7Fc {
    public final /* synthetic */ VoiceClipKeyboardView A00;

    public Ilf(VoiceClipKeyboardView voiceClipKeyboardView) {
        this.A00 = voiceClipKeyboardView;
    }

    public void CFk(Throwable th) {
        11T.A0F(th, 0);
        70Q r0 = this.A00.A03;
        if (r0 == null) {
            11T.A0L("audioClipLogger");
            throw 0Q8.createAndThrow();
        }
        r0.Bb5(th);
    }

    public void CFn() {
    }

    public void CFo() {
    }

    public void CFp() {
        String str;
        VoiceClipKeyboardView voiceClipKeyboardView = this.A00;
        AudioComposerContentView audioComposerContentView = voiceClipKeyboardView.A04;
        if (audioComposerContentView == null) {
            str = "audioComposerContentView";
        } else {
            Integer num = audioComposerContentView.A0U;
            Integer num2 = 0S2.A01;
            if (num == num2 || num == 0S2.A0C) {
                FbSharedPreferences fbSharedPreferences = audioComposerContentView.A0I;
                str = "fbSharedPreferences";
                if (fbSharedPreferences != null) {
                    1G2 r0 = 1NK.A0D;
                    boolean AZn = fbSharedPreferences.AZn(r0, true);
                    if (AZn) {
                        FbSharedPreferences fbSharedPreferences2 = audioComposerContentView.A0I;
                        if (fbSharedPreferences2 != null) {
                            1Ql.A01(fbSharedPreferences2.edit(), r0, false);
                        }
                    }
                    audioComposerContentView.A0Y = AZn;
                    audioComposerContentView.A0Z = true;
                    audioComposerContentView.A0U = num2;
                    if (audioComposerContentView.A0T != null) {
                        audioComposerContentView.A03 = AbstractC2327GOs.A02(audioComposerContentView, r0.getMeasuredWidth());
                        C62l c62l = audioComposerContentView.A0R;
                        if (c62l == null) {
                            str = "choreographer";
                        } else {
                            C1pl c1pl = audioComposerContentView.A0S;
                            if (c1pl == null) {
                                str = "frameCallback";
                            } else {
                                c62l.CY0(c1pl, 400L);
                                View view = audioComposerContentView.A09;
                                if (view == null) {
                                    str = "audioVolumeIndicatorView";
                                } else {
                                    view.setVisibility(0);
                                    AudioComposerContentView.A05(audioComposerContentView);
                                    2OB r02 = audioComposerContentView.A0K;
                                    if (r02 == null) {
                                        str = "timerView";
                                    } else {
                                        r02.setTextColor(audioComposerContentView.A05);
                                        C66i c66i = audioComposerContentView.A0O;
                                        if (c66i == null) {
                                            str = "timerSpring";
                                        } else {
                                            DP1 dp1 = audioComposerContentView.A0T;
                                            if (dp1 != null) {
                                                int top = dp1.getTop();
                                                if (audioComposerContentView.A0B == null) {
                                                    str = "timerViewContainer";
                                                } else {
                                                    c66i.A06((top - r0.getHeight()) / 2.0f);
                                                    c66i.A02();
                                                    C66i c66i2 = audioComposerContentView.A0N;
                                                    if (c66i2 == null) {
                                                        str = "timerSizeSpring";
                                                    } else {
                                                        GOq.A1I(c66i2);
                                                        C66i c66i3 = audioComposerContentView.A0L;
                                                        str = "recordButtonSpring";
                                                        if (c66i3 != null) {
                                                            c66i3.A02();
                                                            c66i3.A07(0.8d);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = "redRecordButton";
                }
            }
            6KV r03 = voiceClipKeyboardView.A02;
            if (r03 == null) {
                str = "viewOrientationLockHelper";
            } else {
                r03.A02();
                voiceClipKeyboardView.setKeepScreenOn(true);
                5YZ r04 = voiceClipKeyboardView.A05;
                if (r04 == null) {
                    str = "audioClipPlayerQueue";
                } else {
                    IDp iDp = r04.A01;
                    if (iDp != null) {
                        r04.A03 = false;
                        iDp.A07();
                    }
                    voiceClipKeyboardView.A08 = voiceClipKeyboardView.A07;
                    70Q r05 = voiceClipKeyboardView.A03;
                    if (r05 != null) {
                        r05.A06(0S2.A00, (Integer) null);
                        return;
                    }
                    str = "audioClipLogger";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x016b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CFq(com.facebook.ui.media.attachments.model.MediaResource r302, long r303) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ilf.CFq(com.facebook.ui.media.attachments.model.MediaResource, long):void");
    }

    public void CFr() {
        String str;
        AudioComposerContentView audioComposerContentView = this.A00.A04;
        if (audioComposerContentView == null) {
            str = "audioComposerContentView";
        } else {
            Integer num = audioComposerContentView.A0U;
            if (num == 0S2.A0C) {
                audioComposerContentView.A0U = 0S2.A0Y;
                AudioComposerContentView.A07(audioComposerContentView);
                return;
            }
            if (num != 0S2.A01) {
                return;
            }
            audioComposerContentView.A0U = 0S2.A0N;
            SimpleVariableTextLayoutView simpleVariableTextLayoutView = audioComposerContentView.A0T;
            if (simpleVariableTextLayoutView == null) {
                str = "redRecordButton";
            } else {
                simpleVariableTextLayoutView.A07("");
                AudioComposerContentView.A08(audioComposerContentView);
                String str2 = audioComposerContentView.A0V;
                if (str2 != null) {
                    C2cd.A05(audioComposerContentView, str2);
                    return;
                }
                str = "maxLengthString";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
