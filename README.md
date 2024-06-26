# Garment Simulator Requirements Checklist

1. **Design Pattern Selection**
    - [ ] Analyze the problem and select the **Abstract Factory pattern** to model the garment simulator.

2. **Implementation**
    - [ ] Define abstract product interfaces or classes for `Top`, `Pants`, and `Shoes`.
    - [ ] Implement concrete product classes (`ProfessionalTop`, `CasualTop`, etc.) for each garment type.
    - [ ] Create an abstract factory interface (`GarmentFactory`) with methods to create `Top`, `Pants`, and `Shoes`.
    - [ ] Implement concrete factory classes (`ProfessionalGarmentFactory`, `CasualGarmentFactory`, `PartyGarmentFactory`) that extend `GarmentFactory` and provide specific implementations for each product variant.

3. **Driver Class**
    - [ ] Develop a driver class (`GarmentSimulator`) to test the Abstract Factory pattern.
    - [ ] Instantiate different concrete factories (e.g., `ProfessionalGarmentFactory`, `CasualGarmentFactory`) and create instances of `Top`, `Pants`, and `Shoes`.
    - [ ] Ensure that products created by the same factory match in their variant (Professional, Casual, Party).

4. **GitHub Repository**
    - [ ] Push the implemented code to a GitHub repository.
    - [ ] Ensure the repository is publicly accessible.

5. **Documentation**
    - [ ] Include comments throughout the code to explain the implementation details and usage of the Abstract Factory pattern.

6. **Submission**
    - [ ] Provide the GitHub repository URL for review.