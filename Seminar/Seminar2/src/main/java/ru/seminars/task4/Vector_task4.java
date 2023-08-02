package ru.seminars.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vector_task4 {
    private double x;
    private double y;
    private double z;

    /**
     * @return vector length
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     *
     * @param vector2 передаваемый вектор
     * @return скалярное произведение двух векторов
     */
    public double scalar(Vector_task4 vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 передаваемый вектор
     * @return вектор, получаемый из произведения двух векторов
     */
    public Vector_task4 vectorProduct(Vector_task4 vector2) {
//        Vector_task4 vector3 = new Vector_task4();
//        vector3.x = this.y * vector2.z - this.z * vector2.y;
//        vector3.y = this.z * vector2.x - this.x * vector2.z;
//        vector3.z = this.x * vector2.y - this.y * vector2.x;
//        return vector3;
        return new Vector_task4(
                this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x
        );
    }

    /**
     * @param vector2 передаваемый вектров
     * @return косинус угла(угол между векторами)
     */
    public double cos(Vector_task4 vector2) {
        return (scalar(vector2)) / (length() * vector2.length());
    }
}
