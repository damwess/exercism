public class GameMaster {

    public String describe(Character character) {
        return String.format(
            "You're a level %d %s with %d hit points.",
            character.getLevel(),
            character.getCharacterClass(),
            character.getHitPoints()
        );
    }

    public String describe(Destination destination) {
        return String.format(
            "You've arrived at %s, which has %d inhabitants.",
            destination.getName(),
            destination.getInhabitants()
        );
    }

    public String describe(TravelMethod travelMethod) {
        if (travelMethod.equals(TravelMethod.HORSEBACK)) {
            return String.format(
                "You're traveling to your destination on %s.",
                travelMethod.name().toLowerCase()
            );
        }

        return String.format(
            "You're traveling to your destination by %s.",
            travelMethod.name().toLowerCase()
        );
    }

    public String describe(
        Character character,
        Destination destination,
        TravelMethod travelMethod
    ) {
        return String.format(
            "%s %s %s",
            this.describe(character),
            this.describe(travelMethod),
            this.describe(destination)
        );
    }

    public String describe(Character character, Destination destination) {
        return String.format(
            "%s %s %s",
            this.describe(character),
            this.describe(TravelMethod.WALKING),
            this.describe(destination)
        );
    }
}
