public class ClasaB extends ClasaA{
    @Override
    public void throwException() throws LevelTwoException {
        throw new LevelTwoException();
    }
}
