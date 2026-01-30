public class GunPowerCharacterDecorator extends CharacterDecorator {
    GunPowerCharacterDecorator(Character character) {
        super(character);
    }

    public String getAbilities() {
        return character.getAbilities() + " With Gun Power";
    }
}
