package X;

import android.net.Uri;
import java.lang.reflect.Constructor;

/* loaded from: Lac.class */
public final class Lac implements 6ZA {
    public final /* synthetic */ 6VH A00;
    public final /* synthetic */ 6Vu A01;

    public Lac(6VH r302, 6Vu r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public /* synthetic */ 6aM[] AJk(Uri uri, java.util.Map map) {
        try {
            Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.extractor.mp3.Mp3Extractor").getConstructor(new Class[0]);
            if (!this.A01.A09.enableMp3Mp4ExtractorLogic) {
                return new 6aM[]{(6aM) constructor.newInstance(new Object[0])};
            }
            6Cj r0 = this.A00.A0X;
            Uri uri2 = r0.A05;
            return (uri2 == null || uri2.getLastPathSegment() == null || !r0.A05.getLastPathSegment().endsWith(".mp3")) ? new 6aM[]{(6aM) constructor.newInstance(new Object[0]), new 6aK()} : new 6aM[]{(6aM) constructor.newInstance(new Object[0])};
        } catch (Exception e) {
            android.util.Log.e("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
            throw AnonymousClass001.A0U(e);
        }
    }
}
