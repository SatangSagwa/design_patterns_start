package org.example.structural_patterns.adapter_pattern;

public class Demo {
/*
// =====================================================
// ADAPTER PATTERN - CHALLENGE
// =====================================================

INSTRUKTION:
Den här koden fungerar, men den har flera problem:
- Klientkoden är hårt kopplad till ett externt API
- Om betalnings-API:t ändras måste klientkoden ändras
- Konvertering mellan format sker i klienten och sprids i koden

PROBLEM:
- Klienten känner till öre/cents och returtyper från det externa API:t
- Duplicerad konverterings- och felhanteringslogik
- Svårt att byta leverantör utan att röra klientens logik

UPPGIFT:
Använd Adapter-mönstret för att bryta kopplingen mellan klienten och det externa API:t.
Målet är att klienten ska kunna initiera betalningar i sitt eget format,
utan kunskap om externa signaturer eller datakonverteringar.

Krav (resultatfokuserade, ej steg-för-steg):
- Klientkoden ska endast känna till en egen abstraktion för betalning
- All datakonvertering och samtal till tredjepart ska ske utanför klienten
- Det ska gå att byta betalningslösning genom att ändra så lite klientkod som möjligt (idealt en rad)
- Misslyckade betalningar ska hanteras centralt och tydligt
- Ursprungsfilen med det externa API:t får inte ändras
*/
    public static void main(String[] args) {
        PaymentApi api = new PaymentApi();

        // Problemet: klienten måste själv konvertera SEK -> öre
        // och hantera PaymentApi:s boolean-returvärde.
        payInSek(api, 199.00);
        payInSek(api, 49.90);
        payInSek(api, 0.00);
    }

    private static void payInSek(PaymentApi api, double amountInSEK) {
        // Klienten tvingas känna till hur PaymentApi fungerar
        int cents = (int)Math.round(amountInSEK * 100);
        boolean ok = api.makePayment(cents);

        // Klienten måste också själv tolka returvärdet
        if (ok) {
            System.out.println("Betalning klar: " + amountInSEK + " SEK");
        } else {
            System.out.println("Betalning misslyckades: " + amountInSEK + " SEK");
        }
    }
}
