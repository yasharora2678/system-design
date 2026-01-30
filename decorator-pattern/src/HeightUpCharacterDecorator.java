public class HeightUpCharacterDecorator extends CharacterDecorator {
    HeightUpCharacterDecorator(Character character) {
        super(character);
    }

    public String getAbilities() {
        return character.getAbilities() + " With Height Up";
    }
}
