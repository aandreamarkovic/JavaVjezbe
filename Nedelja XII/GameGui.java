import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGui extends JFrame {

	private JTextField nameField;
	private JTextField healthField;
	private JTextField xField;
	private JTextField yField;
	private JComboBox<String> colliderBox;
	private JTextArea logArea;
	private JButton startButton;

	public GameGui() {
		setTitle("Game Setup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel(new GridBagLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		gbc.weighty = 0;

		gbc.gridx = 0;
		gbc.gridy = 0;
		mainPanel.add(new JLabel("Ime"), gbc);

		nameField = new JTextField("Harry Poter");
		nameField.setPreferredSize(new Dimension(200, 24));
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(nameField, gbc);

		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 1;
		mainPanel.add(new JLabel("Health (0–100)"), gbc);

		healthField = new JTextField("90");
		healthField.setPreferredSize(new Dimension(80, 24));
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(healthField, gbc);

		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 2;
		mainPanel.add(new JLabel("X pozicija"), gbc);

		xField = new JTextField("12");
		xField.setPreferredSize(new Dimension(80, 24));
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(xField, gbc);

		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 3;
		mainPanel.add(new JLabel("Y pozicija"), gbc);

		yField = new JTextField("9");
		yField.setPreferredSize(new Dimension(80, 24));
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(yField, gbc);

		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 4;
		mainPanel.add(new JLabel("Kolajder"), gbc);

		colliderBox = new JComboBox<>(new String[] { "Rectangle", "Circle" });
		colliderBox.setSelectedItem("Rectangle");
		colliderBox.setPreferredSize(new Dimension(120, 24));
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(colliderBox, gbc);

		startButton = new JButton("Pokreni igru");
		startButton.setPreferredSize(new Dimension(200, 60));

		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0;
		gbc.weighty = 0;
		mainPanel.add(startButton, gbc);

		logArea = new JTextArea(5, 20);
		logArea.setEditable(false);
		logArea.setText("HIT: Player by Orc Shaman for 70\n" + "HIT: Player by Skeleton Archer for 40\n"
				+ "HIT: Player by Lich Lord for 80 ->\n");
		JScrollPane scrollPane = new JScrollPane(logArea);
		scrollPane.setPreferredSize(new Dimension(260, 80));

		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		mainPanel.add(scrollPane, gbc);

		getContentPane().add(mainPanel);

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(GameGui.this, "Ovdje bi krenula igra.\nZa sada je ovo samo UI.", "Info",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new GameGui().setVisible(true);
		});
	}
}