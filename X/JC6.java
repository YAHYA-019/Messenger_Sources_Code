package X;

import com.facebook.rsys.audio.gen.AudioModel;

/* loaded from: JC6.class */
public final /* synthetic */ class JC6 extends C06w {
    public static final JC6 A00 = new JC6();

    public JC6() {
        super(AudioModel.class, "audioBufferingStarted", "getAudioBufferingStarted()Z", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Boolean.valueOf(((AudioModel) obj).audioBufferingStarted);
    }
}
