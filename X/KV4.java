package X;

/* loaded from: KV4.class */
public abstract class KV4 {
    public static String A00(int i) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LineBreak(strategy=");
        int i2 = i & 255;
        A0k.append(i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid");
        A0k.append(", strictness=");
        int i3 = (i >> 8) & 255;
        A0k.append(i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid");
        A0k.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        return AnonymousClass002.A0K(i4 == 1 ? "WordBreak.None" : i4 == 2 ? "WordBreak.Phrase" : i4 == 0 ? "WordBreak.Unspecified" : "Invalid", A0k);
    }
}
