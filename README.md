# Padrao-MVC
Padrão MVC para a entrega do projeto DIO

``` mermaid

classDiagram
    class Car {
        - id: int
        - make: String
        - model: String
        - year: int
        + Car(id: int, make: String, model: String, year: int)
        + getId(): int
        + getMake(): String
        + setMake(make: String): void
        + getModel(): String
        + setModel(model: String): void
        + getYear(): int
        + setYear(year: int): void
    }

    class CarView {
        + printCarDetails(car: Car): void
        + printCarList(cars: List<Car>): void
        + printMessage(message: String): void
    }

    class CarController {
        - cars: List<Car>
        - nextId: int
        - view: CarView
        + CarController()
        + addCar(make: String, model: String, year: int): void
        + listCars(): void
        + findCarById(id: int): Car
        + updateCarDetails(id: int, make: String, model: String, year: int): void
        + deleteCar(id: int): void
    }

    Car --> CarView : Uses
    CarController --> CarView : Uses

```
