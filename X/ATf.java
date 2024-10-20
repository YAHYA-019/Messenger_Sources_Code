package X;

import com.facebook.presence.note.music.musicpicker.model.MusicData;
import kotlin.jvm.functions.Function1;

/* loaded from: ATf.class */
public final class ATf extends C00q implements Function1 {
    public static final ATf A00 = new ATf();

    public ATf() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MusicData musicData = (MusicData) obj;
        11T.A0F(musicData, 0);
        return Long.valueOf(musicData.A01);
    }
}
