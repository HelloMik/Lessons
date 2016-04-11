public class Board extends JPanel implements MouseListener, ActionListener {

Наш класс, в котором будет рисоваться наша сцена
Он является расширением класса JPanel
И в нем будут реализованы методы для обработки событий от мышки (implements MouseListener) и любых действий в окне (ActionListener)


	private int X, Y;
	private int R = 30;

Переменные отвечающие за координаты и радиус круга, который мы будем рисовать


	public Board() {

		initBoard();
	}

Конструктор класса
в нем мы делаем иницциализацию / настройку нашей программы


    private void initBoard() {

		addMouseListener(this);

Добавляем обработчик событий от мышки


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

Здесь будет все рисоваться
@Override - значит, что мы перезаписали уже существующий метод, который был у класса-родителя (JPanel)
Однако все равно вызываем его: super.paintComponent(g);

	drawScene(g);

Рисует наши действия


	private void drawScene(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        g2d.drawOval( X - R / 2, Y - R / 2, R, R );
    }

    Graphics2D g2d - объект через который мы будем все рисовать
    g2d.setPaint(Color.red); - цвет линий
    g2d.drawOval( X - R / 2, Y - R / 2, R, R ); - рисуем круг с координатами цщелчка мыши и радиусом


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

Метод который вызывает перерисовку окна при любом событии (именение размера окна...)

	public void mousePressed(MouseEvent e) {
    	System.out.format("click at %d : %d\n", e.getX(), e.getY());
    	X = e.getX();
    	Y = e.getY();

    	repaint();
    }

System.out.format("click at %d : %d\n", e.getX(), e.getY()); - выводит в консоль сформированное сообщение, где вместо %d поставяться параметры координат щелчка мыши e.getX()
Сохраним координаты щелчка в Х У
и перерисовываем окно repaint();
