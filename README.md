# Garment Simulator Requirements Checklist

1. **Design Pattern Selection**
    - [x] Analyze the problem and select the **Abstract Factory pattern** to model the garment simulator.

2. **Implementation**
    - [x] Define abstract product interfaces or classes for `Top`, `Pants`, and `Shoes`.
    - [x] Implement concrete product classes (`ProfessionalTop`, `CasualTop`, etc.) for each garment type.
    - [x] Create an abstract factory interface (`GarmentFactory`) with methods to create `Top`, `Pants`, and `Shoes`.
    - [x] Implement concrete factory classes (`ProfessionalGarmentFactory`, `CasualGarmentFactory`, `PartyGarmentFactory`) that extend `GarmentFactory` and provide specific implementations for each product variant.

3. **Driver Class**
    - [x] Develop a driver class (`GarmentSimulator`) to test the Abstract Factory pattern.
    - [x] Instantiate different concrete factories (e.g., `ProfessionalGarmentFactory`, `CasualGarmentFactory`) and create instances of `Top`, `Pants`, and `Shoes`.
    - [x] Ensure that products created by the same factory match in their variant (Professional, Casual, Party).

4. **GitHub Repository**
    - [x] Push the implemented code to a GitHub repository.
    - [x] Ensure the repository is publicly accessible.

5. **Documentation**
    - [x] Include comments throughout the code to explain the implementation details and usage of the Abstract Factory pattern.

6. **Submission**
    - [x] Provide the GitHub repository URL for review.

7. **Testing**
    - [x] Test the driver class to ensure that the Abstract Factory pattern works as expected.

8. **Code Review**
    - [x] Review the code to ensure it adheres to the best practices and standards.

9. **Output**
    - [x] The output should be the following:
        - [x] Professional Garment Set
        - [x] Casual Garment Set
        - [x] Party Garment Set

10. **Image**
    - [x] Include an image of the output in the README.md file.

## Output
