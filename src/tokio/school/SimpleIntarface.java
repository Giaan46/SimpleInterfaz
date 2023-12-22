package tokio.school;

public interface SimpleIntarface {
    public void FuncionPrueba( String text);

    default void Mostrar(){
        System.out.println("esto es por defecto ");
    }
}
