package X;

import com.facebook.inspiration.audiosharing.model.AudioTranscriptionTokenParam;
import java.util.Comparator;

/* loaded from: G6g.class */
public final class G6g implements Comparator {
    public static final G6g A00 = new Object();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AudioTranscriptionTokenParam audioTranscriptionTokenParam = (AudioTranscriptionTokenParam) obj;
        AudioTranscriptionTokenParam audioTranscriptionTokenParam2 = (AudioTranscriptionTokenParam) obj2;
        11T.A0H(audioTranscriptionTokenParam, audioTranscriptionTokenParam2);
        return 11T.A00(audioTranscriptionTokenParam.A01, audioTranscriptionTokenParam2.A01);
    }
}
