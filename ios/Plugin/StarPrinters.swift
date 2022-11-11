import Foundation

@objc public class StarPrinters: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
